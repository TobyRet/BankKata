package com.codurance;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class Transaction {

    private final int amount;
    private final Date date;
    private DateFormat dateFormatter;

    public Transaction(int amount) {
        this.amount = amount;
        this.date = new Date();
    }

    public void printTo(StatementPrinter statementPrinter) {
        statementPrinter.printTransaction(formattedDate(), amount);
    }

    private String formattedDate() {
        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormatter.format(date).toString();
    }
}
