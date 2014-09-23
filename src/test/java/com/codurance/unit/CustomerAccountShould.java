package com.codurance.unit;

import com.codurance.CustomerAccount;
import com.codurance.CustomerTransactionsRepository;
import com.codurance.StatementPrinter;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CustomerAccountShould {

    private CustomerAccount customerAccount;
    private CustomerTransactionsRepository customerTransactionsRepository = mock(CustomerTransactionsRepository.class);
    private StatementPrinter statementPrinter = mock(StatementPrinter.class);

    @Before
    public void initialise() {
        customerAccount = new CustomerAccount(customerTransactionsRepository, statementPrinter);
    }

    @Test public void
    send_transaction_to_CustomerTransactionRepository() {
        customerAccount.processTransaction(30);
        verify(customerTransactionsRepository).add(any());
    }

    @Test public void
    print_statement() {
        customerAccount.printStatement();
        verify(statementPrinter).printStatement(customerTransactionsRepository.retrieveAll());
    }
}
