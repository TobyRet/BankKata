package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class BankingServiceShould {
    private BankingService bankingService;
    private CustomerAccount customerAccount;
    private CustomerAccount destinationAccount;
    private CustomerAccountDAO customerAccountDAO;

    @Before
    public void initialise() {
        customerAccount = new CustomerAccount();
        customerAccountDAO = mock(CustomerAccountDAO.class);
        bankingService = new BankingService(customerAccountDAO);
    }

    @Test public void
    should_retrieve_customer_account_before_fulfilling_transaction() {
        int customerID = 12345;
        when(customerAccountDAO.getCustomerAccount(customerID)).thenReturn(customerAccount);
        assertThat(bankingService.retrieveCustomerAccount(customerID), is(customerAccount));
    }




//    @Test public void
//    deposit_funds_into_an_account() {
//        bankingService.deposit(30, customerAccount);
//        verify(customerAccount).depositFunds(30);
//
//    }
//
//    @Test public void
//    withdraw_funds_from_an_account() {
//        bankingService.withdraw(30, customerAccount);
//        verify(customerAccount).withdrawFunds(30);
//    }
//
//    @Test public void
//    transfer_funds_to_another_account() {
//        destinationAccount = mock(CustomerAccount.class);
//        bankingService.transferFunds(30, customerAccount, destinationAccount);
//        verify(customerAccount).withdrawFunds(30);
//        verify(destinationAccount).depositFunds(30);
//    }
//
//    @Test public void
//    print_bank_balance() {
//        bankingService.printStatement(customerAccount);
//        verify(customerAccount).printStatement();
//    }
}