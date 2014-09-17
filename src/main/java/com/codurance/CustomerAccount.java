package com.codurance;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class CustomerAccount {
    private int balance;

    public void depositFunds(int amount) {
        balance+=amount;
    }

    public void withdrawFunds(int amount) {
        balance-=amount;
    }

    public void printStatement() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
