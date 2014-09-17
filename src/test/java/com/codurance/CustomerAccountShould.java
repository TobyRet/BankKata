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
    add_deposit_to_accountHistory() {
        customerAccount.depositFunds(30);
        verify(accountHistory).enterTransaction("Deposit", 30);
    }

    @Test public void
    add_withdrawal_to_accountHistory() {
        customerAccount.withdrawFunds(30);
        verify(accountHistory).enterTransaction("Withdrawal", 30);
    }

    @Test public void
    add_transfer_to_accountHistory() {
        customerAccount.transferFunds(30);
        verify(accountHistory).enterTransaction("Transfer", 30);
    }

    @Test public void
    print_statement() {
        customerAccount.printStatement();
        verify(accountHistory).retrieveAllTransactions();
    }
}
