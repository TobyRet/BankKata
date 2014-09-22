package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 22/09/2014.
 */
public class TransactionFormatter {
    private List<String> formattedTransaction;

    public TransactionFormatter() {
        this.formattedTransaction = new ArrayList<>();
    }

    public void addDate(String date) {
        formattedTransaction.add(date);
    }

    public void addAmount(String amount) {
        formattedTransaction.add(amount);
    }

    public void addBalance(String balance) {
        formattedTransaction.add(balance);
    }

    public void addLineBreak() {
        formattedTransaction.add("\n");
    }

    public List<String> retrieveFormattedTransaction() {
        return formattedTransaction;
    }
}
