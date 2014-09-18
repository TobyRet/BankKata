package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class BankServiceShould {

    private static final Transaction DEPOSIT = new Transaction(30);
    private static final Transaction WITHDRAW = new Transaction(-30);
    private BankService bankService;
    private CustomerAccount customerAccount;
    private CustomerAccount destinationAccount;


   @Before
   public void initialise() {
        customerAccount = mock(CustomerAccount.class);
        bankService = new BankService(customerAccount);
   }

    @Test public void
    deposit_funds_to_customer_account() {
        bankService.deposit(DEPOSIT);
        verify(customerAccount).processTransaction(DEPOSIT);
    }

    @Test public void
    withdraw_funds_from_customer_account() {
        bankService.withdraw(WITHDRAW);
        verify(customerAccount).processTransaction(WITHDRAW);
    }

    @Test public void
    transfer_funds_to_another_customer_account() {
        bankService.transfer(WITHDRAW);
        verify(customerAccount).processTransaction(WITHDRAW);
    }

    @Test public void
    print_statement() {
        bankService.printStatement();
        verify(customerAccount).printStatement();
    }


}
