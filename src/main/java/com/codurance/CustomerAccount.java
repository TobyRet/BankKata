package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerAccount {

    private CustomerTransactionsCollection customerTransactions;
    private AccountDisplay accountDisplay;

    public CustomerAccount(CustomerTransactionsCollection customerTransactions, AccountDisplay accountDisplay) {
        this.customerTransactions = customerTransactions;
        this.accountDisplay = accountDisplay;
    }

    public void processTransaction(Transaction transaction) {
        customerTransactions.add(transaction);
    }

    public void printStatement() {
        accountDisplay.printStatementToConsole();
    }
}
