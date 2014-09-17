package com.codurance;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tobyretallick on 17/09/2014.
 */
public class AccountHistory {

    private List<Object> statement = new ArrayList<Object>();
    private List<Object> transaction;
    private Date dateToday;
    private DateFormat dateFormatter;

    public void enterTransaction(String transactionType, int amount) {
        transaction = new ArrayList<Object>();
        transaction.add(createFormattedDateStamp());
        transaction.add(30);
        transaction.add(30);
        statement.add(transaction);
    }

    public List<Object> retrieveAllTransactions() {
        return statement;
    }

    public List<Object> retrieveTransaction() {
        return transaction;
    }

    public String createFormattedDateStamp() {
        dateToday = new Date();
        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormatter.format(dateToday);
    }
}
