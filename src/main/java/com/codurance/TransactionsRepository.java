package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class TransactionsRepository {

    private List<Transaction> transactions = new ArrayList<>();

    public void store(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactions(StatementPrinter statementPrinter) {
        statementPrinter.printColumnHeaders();
        for (Transaction transaction : transactions) {
            transaction.print(statementPrinter);
        }
    }
}
