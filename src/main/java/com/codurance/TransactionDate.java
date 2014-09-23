package com.codurance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionDate {
    public String create() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-mm-yyyy");
        Date transactionDate = new Date();
        return DATE_FORMAT.format(transactionDate);
    }
}
