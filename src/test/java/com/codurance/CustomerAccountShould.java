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
    private TransactionHistory transactionHistory;

    @Before
    public void initialise() {
        transactionHistory = mock(TransactionHistory.class);
        customerAccount = new CustomerAccount(transactionHistory);
    }

    @Test
    public void
    add_deposit_to_transactionHistory() {
        customerAccount.depositFunds(30);
        verify(transactionHistory).enterTransaction("Deposit",30);
    }

    @Test public void
    add_withdrawal_to_transactionHistory() {
        customerAccount.withdrawFunds(30);
        verify(transactionHistory).enterTransaction("Withdraw", -30);
    }

    @Test public void
    add_transfer_to_transactionHistory() {
        customerAccount.transferFunds(30);
        verify(transactionHistory).enterTransaction("Transfer", -30);
    }

    @Test public void
    print_statement() {
        customerAccount.printStatement();
        verify(transactionHistory).retrieveFormattedStatement();
    }
}
