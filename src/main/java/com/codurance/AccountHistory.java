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
    private int balance;

    public void enterTransaction(String transactionType, int amount) {
        debitOrCreditAccount(transactionType, amount);
        transaction = new ArrayList<Object>();
        transaction.add(createFormattedDateStamp());
        transaction.add(amount);
        transaction.add(getBalance());
        statement.add(transaction);
    }

    private void debitOrCreditAccount(String transactionType, int amount) {
        if(transactionType == "deposit") {
            updateBalance(amount);
        } else {
            updateBalance(-amount);
        }
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

    public void updateBalance(int balance) {
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }
}
