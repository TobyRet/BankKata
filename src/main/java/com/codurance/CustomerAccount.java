package com.codurance;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccount {

    private TransactionHistory transactionHistory;

    public CustomerAccount(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void depositFunds(int amount) {
        transactionHistory.enterTransaction("Deposit", amount);
    }

    public void withdrawFunds(int amount) {
        transactionHistory.enterTransaction("Withdraw", -amount);
    }

    public void printStatement() {
        transactionHistory.retrieveFormattedStatement();
    }

    public void transferFunds(int amount) {
        transactionHistory.enterTransaction("Transfer", -amount);
    }
}