package com.codurance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerTransactionsShould {

    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction WITHDRAW_£20 = new Transaction(-30);
    private CustomerTransactions customerTransactions;

    @Test public void
    add_transaction_to_allCustomerTransactions_list() {
        customerTransactions = new CustomerTransactions();
        customerTransactions.add(DEPOSIT_£30);
        customerTransactions.add(WITHDRAW_£20);
        assertThat(customerTransactions.retrieveAll().size(),is(2));
    }
}
