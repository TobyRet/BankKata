package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 22/09/2014.
 */
public class FormattedTransactions {

    private final List<TransactionFormatter> allFormattedTransactions;

    public FormattedTransactions() {
        this.allFormattedTransactions = new ArrayList<>();
    }

    public void addNewFormattedTransaction(TransactionFormatter formattedTransaction) {
        allFormattedTransactions.add(formattedTransaction);
    }

    public List<String> retrieveAll() {
        return null;
    }
}
