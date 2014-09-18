package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class BankServiceShould {

    private static final Transaction DEPOSIT = new Transaction(30);
    private BankService bankService;
    private CustomerAccount customerAccount;

    @Test public void
    create_deposit_transaction() {
        customerAccount = mock(CustomerAccount.class);
        bankService = new BankService(customerAccount);

        bankService.deposit(DEPOSIT);
        verify(customerAccount).processTransaction(DEPOSIT);
    }
}
