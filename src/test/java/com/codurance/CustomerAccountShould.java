package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerAccountShould {

    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction DEPOSIT_£60 = new Transaction(60);
    private CustomerAccount customerAccount;
    private CustomerTransactions customerTransactions;

    @Test public void
    add_transaction_to_customer_transaction_repository() {
        customerTransactions = mock(CustomerTransactions.class);
        customerAccount = new CustomerAccount(customerTransactions);

        customerAccount.processTransaction(DEPOSIT_£30);
        customerAccount.processTransaction(DEPOSIT_£60);

        verify(customerTransactions).add(DEPOSIT_£30);
    }

}
