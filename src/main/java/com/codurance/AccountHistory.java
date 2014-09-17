package com.codurance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobyretallick on 17/09/2014.
 */
public class AccountHistory {

    private List<Object> statement = new ArrayList<>();
    private List<Object> transaction;
    private int balance;
    private Formatter formatter;

    public AccountHistory(Formatter formatter) {
        this.formatter = formatter;
    }

    public void enterTransaction(String transactionType, int amount) {
        debitOrCreditAccount(transactionType, amount);

        String getDate = formatter.createFormattedDateStamp();

        transaction = new ArrayList<>();
        transaction.add(getDate);
        transaction.add(amount);
        transaction.add(getBalance());

        statement.add(transaction);
    }

    private void debitOrCreditAccount(String transactionType, int amount) {
        if (transactionType == "deposit") {
            updateBalance(amount);
        } else {
            updateBalance(-amount);
        }
    }

    public List<Object> retrieveTransaction() {
        return transaction;
    }

    public List<Object> retrieveAllTransactions() {
        return statement;
    }

    public void updateBalance(int balance) {
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }
}
