package com.codurance;

import java.util.List;

/**
 * Created by tobyretallick on 19/09/2014.
 */
public class StatementPrinter {

    private List<String> customerTransactions;

    public StatementPrinter(List<String> customerTransactions) {
        this.customerTransactions = customerTransactions;
    }

    public void printTransaction(String date, int amount) {
        String transaction = date + "\t\t" + ("" + amount);
        customerTransactions.add(transaction);
    }
}
