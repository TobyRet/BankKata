package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class CustomerTransactions {

    private final List<Transaction> allCustomerTransactions;

    public CustomerTransactions() {
        allCustomerTransactions = new ArrayList<>();
    }

    public List<Transaction> retrieveAll() {
        return allCustomerTransactions;
    }

    public void add(Transaction transactionType) {

    }
}
