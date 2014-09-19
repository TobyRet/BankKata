package com.codurance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerTransactionsCollectionShould {

    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction WITHDRAW_£20 = new Transaction(-30);
    private CustomerTransactionsCollection customerTransactionsCollection;

    @Test public void
    add_transaction_to_allCustomerTransactions_list() {
        customerTransactionsCollection = new CustomerTransactionsCollection();
        customerTransactionsCollection.add(DEPOSIT_£30);
        customerTransactionsCollection.add(WITHDRAW_£20);
        assertThat(customerTransactionsCollection.retrieveAll().size(), is(2));
        assertThat(customerTransactionsCollection.retrieveAll().get(1),is(WITHDRAW_£20));
    }
}
