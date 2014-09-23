package com.codurance;

import java.util.List;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionsRepository {
    private List<Transaction> allTransactions;

    public void store(Transaction transaction) {
        allTransactions.add(transaction);
    }
}
