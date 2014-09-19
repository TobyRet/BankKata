package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerTransactionsCollection {

    private final List<Transaction> allCustomerTransactions;

    public CustomerTransactionsCollection() {
        allCustomerTransactions = new ArrayList<>();
    }

    public List<Transaction> retrieveAll() {
        return allCustomerTransactions;
    }

    public void add(Transaction transaction) {
        allCustomerTransactions.add(transaction);
    }
}
