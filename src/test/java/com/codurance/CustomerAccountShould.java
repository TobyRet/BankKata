package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccountShould {
    private CustomerAccount customerAccount;
    private AccountHistory accountHistory;

    @Before
    public void initialise() {
        accountHistory = mock(AccountHistory.class);
        customerAccount = new CustomerAccount(accountHistory);
    }

    @Test
    public void
    add_deposit_to_account() {
        customerAccount.depositFunds(30);
        verify(accountHistory).enterTransaction("Deposit", 30);
    }

    @Test public void
    deduct_withdrawal_from_balance() {
        customerAccount.withdrawFunds(30);
        verify(accountHistory).enterTransaction("Withdrawal", 30);
    }

//    @Test public void
//    transfer_funds_to_another_account() {
//
//    }
}
