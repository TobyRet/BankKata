package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionsRepository {

    private List<Transaction> transactions = new ArrayList<>();

    public void store(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactions(StatementPrinter statementPrinter) {
        for (Transaction transaction : transactions) {
            transaction.print(statementPrinter);
        }
    }
}
