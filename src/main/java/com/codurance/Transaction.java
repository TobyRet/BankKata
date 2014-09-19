package com.codurance;

import java.util.Date;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class Transaction {

    private final int amount;
    private final Date date;

    public Transaction(int amount) {
        this.amount = amount;
        this.date = new Date();
    }
}
