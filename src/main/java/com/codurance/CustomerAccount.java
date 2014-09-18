package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerAccount {

    private final CustomerTransactions customerTransactions;

    public CustomerAccount(CustomerTransactions customerTransactions) {
        this.customerTransactions = customerTransactions;
    }

    public void processTransaction(Transaction transaction) {
        customerTransactions.add(transaction);
    }

    public void printStatement() {

    }
}
