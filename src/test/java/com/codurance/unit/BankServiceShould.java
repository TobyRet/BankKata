package com.codurance.unit;

import com.codurance.BankService;
import com.codurance.CustomerAccount;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class BankServiceShould {

    private static final int DEPOSIT_£30 = 30;
    private static final int WITHDRAW_£20 = 20;
    private static final int TRANSFER_£5 = 5;
    private BankService bankService;
    private CustomerAccount customerAccount;


   @Before
   public void initialise() {
        customerAccount = mock(CustomerAccount.class);
        bankService = new BankService(customerAccount);
   }

    @Test public void
    deposit_funds_to_customer_account() {
        bankService.deposit(DEPOSIT_£30);
        verify(customerAccount).processTransaction(DEPOSIT_£30);
    }

    @Test public void
    withdraw_funds_from_customer_account() {
        bankService.withdraw(WITHDRAW_£20);
        verify(customerAccount).processTransaction(WITHDRAW_£20);
    }

    @Test public void
    transfer_funds_to_another_customer_account() {
        bankService.transfer(TRANSFER_£5);
        verify(customerAccount).processTransaction(TRANSFER_£5);
    }

    @Test public void
    print_statement() {
        bankService.printStatement();
        verify(customerAccount).printStatement();
    }


}
