package com.codurance.unit;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;

import static java.time.LocalDate.now;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BankingServiceShould {

    private static final Money DEPOSIT_£20 = new Money(20);
    private static final TransactionDate TRANSACTION_DATE = new TransactionDate(now());
    private static final Money WITHDRAW_£10 = new Money(10);
    private BankService bankService;
    private TransactionsRepository transactionsRepository;
    private StatementPrinter statementPrinter;
    private Transaction depositTransaction;
    private Transaction withdrawalTransaction;

    @Before
    public void initialise() {
        transactionsRepository = mock(TransactionsRepository.class);
        statementPrinter = mock(StatementPrinter.class);
        bankService = new BankService(transactionsRepository, statementPrinter);
    }

    @Test public void
    should_deposit_funds() {
        depositTransaction = mock(DepositTransaction.class);
        bankService.deposit(DEPOSIT_£20, TRANSACTION_DATE);
        verify(transactionsRepository).store(any());
    }

    @Test public void
    should_withdraw_funds() {
        withdrawalTransaction = mock(WithdrawalTransaction.class);
        bankService.withdraw(WITHDRAW_£10, TRANSACTION_DATE);
        verify(transactionsRepository).store(any());
    }

    @Test public void
    should_print_statement_to_console() {
        bankService.printStatement();
        verify(transactionsRepository).printTransactions(statementPrinter);
    }
}
