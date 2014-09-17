package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class BankingServiceShould {
    private BankingService bankingService;
    private CustomerAccount customerAccount;
    private CustomerAccount destinationAccount;
    private CustomerAccountDAO customerAccountDAO;
    private static final int CUSTOMER_ID = 12345;
    private static final int DESTINATION_CUSTOMER_ID = 34567;

    @Before
    public void initialise() {
        customerAccountDAO = mock(CustomerAccountDAO.class);
        bankingService = new BankingService(customerAccountDAO);
        customerAccount = mock(CustomerAccount.class);
        when(bankingService.retrieveCustomerAccount(CUSTOMER_ID)).thenReturn(customerAccount);
    }

    @Test public void
    should_retrieve_customer_account_before_fulfilling_transaction() {
        assertThat(bankingService.retrieveCustomerAccount(CUSTOMER_ID), is(customerAccount));
    }

    @Test public void
    deposit_funds_into_an_account() {
        bankingService.deposit(30, CUSTOMER_ID);
        verify(customerAccount).depositFunds(30);
    }

    @Test public void
    withdraw_funds_from_an_account() {
        bankingService.withdraw(30, CUSTOMER_ID);
        verify(customerAccount).withdrawFunds(30);
    }

    @Test public void
    transfer_funds_to_another_account() {
        destinationAccount = mock(CustomerAccount.class);
        when(bankingService.retrieveCustomerAccount(DESTINATION_CUSTOMER_ID)).thenReturn(destinationAccount);
        bankingService.transferFunds(30, CUSTOMER_ID, DESTINATION_CUSTOMER_ID);
        verify(customerAccount).withdrawFunds(30);
        verify(destinationAccount).depositFunds(30);
    }

//    @Test public void
//    print_bank_balance() {
//        bankingService.printStatement(customerAccount);
//        verify(customerAccount).printStatement();
//    }
}