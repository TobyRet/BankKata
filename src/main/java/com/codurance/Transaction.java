package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class Transaction {
    private final Money money;
    private final TransactionDate date;
    private final TransactionType transactionType;

    public Transaction(Money money, TransactionDate date, TransactionType transactionType) {
        this.money = money;
        this.date = date;
        this.transactionType = transactionType;
    }

    public void print() {
        date.printDate();
        money.printAmount();
    }
}
