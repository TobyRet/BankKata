package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StatementPrinterShould {

    private static final Transaction DEPOSIT_£20 = new Transaction(20);
    private static final Transaction WITHDRAW_£10 = new Transaction(-10);
    private StatementPrinter statementPrinter;
    private CustomerTransactionsRepository customerTransactionsRepository;
    private TransactionFormatter formattedTransaction;
    private FormattedTransactions formattedTransactions;

    @Before
    public void initialise() {
        formattedTransaction = mock(TransactionFormatter.class);
        formattedTransactions = mock(FormattedTransactions.class);
        statementPrinter = new StatementPrinter(formattedTransaction, formattedTransactions);
    }

    @Test public void
    calculate_balance_and_send_transaction_information_to_collection() {

        statementPrinter.printTransaction("21/09/14", 30);

        verify(formattedTransaction).addDate(any());
        verify(formattedTransaction).addAmount(any());
        verify(formattedTransaction).addBalance(any());
        verify(formattedTransaction).addLineBreak();

        verify(formattedTransactions).addNewFormattedTransaction(formattedTransaction);
    }

    @Test public void
    print_transactions_and_invoke_Display() {

        customerTransactionsRepository = new CustomerTransactionsRepository();
        customerTransactionsRepository.add(DEPOSIT_£20);
        customerTransactionsRepository.add(WITHDRAW_£10);

        statementPrinter.printStatement(customerTransactionsRepository.retrieveAll());

    }

}
