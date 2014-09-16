package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class BankingServiceShould {
    private BankingService bankingService;
    private CustomerAccount customerAccount;
    private CustomerAccount destinationAccount;

    @Before
    public void initialise() {
        customerAccount = mock(CustomerAccount.class);
        bankingService = new BankingService(customerAccount);
    }

    @Test public void
    deposit_funds_into_an_account() {
        bankingService.deposit(30, customerAccount);
        verify(customerAccount).depositFunds(30);

    }

    @Test public void
    withdraw_funds_from_an_account() {
        bankingService.withdraw(30, customerAccount);
        verify(customerAccount).withdrawFunds(30);
    }

    @Test public void
    transfer_funds_to_another_account() {
        destinationAccount = mock(CustomerAccount.class);
        bankingService.transfer(30, customerAccount, destinationAccount);
        verify(customerAccount).withdrawFunds(30);
        verify(destinationAccount).depositFunds(30);
    }

    @Test public void
    print_bank_balance() {
        bankingService.printStatement(customerAccount);
        verify(customerAccount).printStatement();
    }
}
