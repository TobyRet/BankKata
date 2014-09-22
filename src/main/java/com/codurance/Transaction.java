package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class Transaction {

    private final int amount;
    private TransactionDate transactionDate;

    public Transaction(int amount) {
        this.amount = amount;
        this.transactionDate = new TransactionDate();
    }

    public void printTo(StatementPrinter statementPrinter) {
        statementPrinter.printTransaction(transactionDate.getFormattedDate(), amount);
    }
}
