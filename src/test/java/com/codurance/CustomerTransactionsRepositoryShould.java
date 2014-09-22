package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerTransactionsRepositoryShould {

    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction WITHDRAW_£20 = new Transaction(-30);
    private CustomerTransactionsRepository customerTransactionsRepository;

    @Test
    public void
    add_transaction_to_allCustomerTransactions_list() {
        customerTransactionsRepository = new CustomerTransactionsRepository();
        customerTransactionsRepository.add(DEPOSIT_£30);
        customerTransactionsRepository.add(WITHDRAW_£20);
        assertThat(customerTransactionsRepository.retrieveAll().size(), is(2));
    }
}
