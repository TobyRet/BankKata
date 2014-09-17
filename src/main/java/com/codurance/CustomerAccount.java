package com.codurance;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccount {

    private AccountHistory accountHistory;

    public CustomerAccount(AccountHistory accountHistory) {
        this.accountHistory = accountHistory;
    }

    public void depositFunds(int amount) {
        accountHistory.enterTransaction("Deposit", amount);
    }

    public void withdrawFunds(int amount) {
        accountHistory.enterTransaction("Withdrawal", amount);
    }

    public void transferFunds(int amount) {
        accountHistory.enterTransaction("Transfer", amount);
    }

    public void printStatement() {
        accountHistory.retrieveAllTransactions();
    }
}