package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerAccountShould {

    private CustomerAccount customerAccount;
    private CustomerTransactionsCollection customerTransactions;
    private Transaction transaction;
    private ConsoleDisplay consoleDisplay;

    @Before
    public void initialise() {
        customerTransactions = mock(CustomerTransactionsCollection.class);
        consoleDisplay = mock(ConsoleDisplay.class);
        transaction = mock(Transaction.class);
        customerAccount = new CustomerAccount(customerTransactions, consoleDisplay);
    }

    @Test public void
    add_transaction_to_customer_transaction_repository() {
        customerAccount.addToTransactionList(transaction);
        verify(customerTransactions).add(transaction);
    }

    @Test public void
    print_statement_to_console() {
        customerAccount.printStatement();
        verify(consoleDisplay).printStatement();
    }

}
