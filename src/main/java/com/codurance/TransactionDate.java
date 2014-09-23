package com.codurance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionDate {
    public String create() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-mm-yyyy");
        return DATE_FORMAT.format(getDate());
    }

    private Date getDate() {
        return new Date();
    }

    public void printDate() {
        System.out.print(create());
    }
}
