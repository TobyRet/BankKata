package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerAccount {

    private CustomerTransactionsCollection customerTransactions;
    private ConsoleDisplay consoleDisplay;

    public CustomerAccount(CustomerTransactionsCollection customerTransactions, ConsoleDisplay consoleDisplay) {
        this.customerTransactions = customerTransactions;
        this.consoleDisplay = consoleDisplay;
    }

    public void processTransaction(int amount) {
        addToTransactionList(new Transaction(amount));
    }

    public void addToTransactionList(Transaction transaction) {
        customerTransactions.add(transaction);
    }

    public void printStatement() {
        consoleDisplay.printStatement();
    }
}
