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


   @Before
   public void initialise() {
        customerAccount = mock(CustomerAccount.class);
        bankService = new BankService(customerAccount);
   }

    @Test public void
    create_deposit_transaction() {
        bankService.deposit(DEPOSIT);
        verify(customerAccount).processTransaction(DEPOSIT);
    }

    @Test public void
    create_withdraw_transaction() {
        bankService.withdraw(WITHDRAW);
        verify(customerAccount).processTransaction(WITHDRAW);
    }
}
