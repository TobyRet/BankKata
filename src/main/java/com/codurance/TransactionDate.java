package com.codurance;

import java.text.DateFormat;
import java.util.Date;

public class TransactionDate {
    private DateFormat dateFormatter;

    public String getFormattedDate() {
        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        Date today = new Date();
        return dateFormatter.format(today).toString();
    }
}
