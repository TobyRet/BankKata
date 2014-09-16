package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class UserAccountShould {
    private UserAccount userAccount;

    @Test public void
    deposit_funds_to_an_account() {
        userAccount = new UserAccount();
        userAccount.deposit(30);
        assertThat(userAccount.getBalance(), is(30));
    }
}
