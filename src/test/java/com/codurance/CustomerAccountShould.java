package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccountShould {
    private CustomerAccount customerAccount;
    private AccountHistory accountHistory;

    @Test
    public void
    add_deposit_to_account() {
        accountHistory = mock(AccountHistory.class);
        customerAccount = new CustomerAccount(accountHistory);
        customerAccount.depositFunds(30);
        verify(accountHistory).enterTransaction("deposit", 30);
    }

//    @Test public void
//    deduct_withdrawal_from_balance() {
//        customerAccount.setBalance(30);
//        customerAccount.withdrawFunds(30);
//        assertThat(customerAccount.getBalance(), is(0));
//    }
//
//    @Test public void
//    transfer_funds_to_another_account() {
//
//    }
}
