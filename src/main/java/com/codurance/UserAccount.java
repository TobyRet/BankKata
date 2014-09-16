package com.codurance;

/**
 * Created by tobyretallick on 15/09/2014.
 */
public class UserAccount {
    private int balance;

    public void deposit(int amount) {
        balance+=amount;
    }

    public void withdraw(int amount) {
        if(balance == 0) {
            throw new RuntimeException("You have insufficient funds");
        }
        balance -=amount;
    }

    public void transfer() {
    }

    public void printStatement() {
    }


    public int getBalance() {
        return balance;
    }
}
