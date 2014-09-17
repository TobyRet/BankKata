package com.codurance;

import org.junit.Before;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccountShould {
    private CustomerAccount customerAccount;
    private BankStatement bankStatement;

    @Before
    public void initialise() {
        customerAccount = new CustomerAccount();
    }

//    @Test public void
//    add_deposit_to_account() {
//        bankStatement = mock(BankStatement.class);
//        customerAccount.depositFunds(30);
//        verify(bankStatement).createTransaction("deposit", 30);
//        customerAccount.retrieveBalance()
//    }

//    @Test public void
//    deduct_withdrawal_from_balance() {
//        customerAccount.setBalance(30);
//        customerAccount.withdrawFunds(30);
//        assertThat(customerAccount.getBalance(), is(0));
//    }
//
//    @Test public void
//    transfer_funds_to_another_account() {
//
//    }
}
