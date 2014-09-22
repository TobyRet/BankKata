package com.codurance;

import java.util.List;

public class StatementPrinter {


    private TransactionFormatter formattedTransaction;
    private FormattedTransactions formattedTransactions;
    private int balance = 0;

    public StatementPrinter(TransactionFormatter formattedTransaction, FormattedTransactions formattedTransactions) {
        this.formattedTransaction = formattedTransaction;
        this.formattedTransactions = formattedTransactions;
    }

    public void printTransaction(String date, int amount) {
        formattedTransaction.addDate(date);
        formattedTransaction.addAmount("" + amount);
        formattedTransaction.addBalance("" + (balance += amount));
        formattedTransaction.addLineBreak();

        formattedTransactions.addNewFormattedTransaction(formattedTransaction);
    }

    public void printStatement(List<Transaction> allCustomerTransactions) {
        for(Transaction customerTransaction : allCustomerTransactions) {
            customerTransaction.printTo(this);
        }
    }

}
