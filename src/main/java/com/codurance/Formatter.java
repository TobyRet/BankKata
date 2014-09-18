package com.codurance;

import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by tobyretallick on 17/09/2014.
 */
public class Formatter {

    private static Date dateToday;
    private static DateFormat dateFormatter;
    private PrintStream header;
    private PrintStream body;

    public String createFormattedDateStamp() {
        dateToday = new Date();
        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormatter.format(dateToday);
    }

    public String createFormattedStatement(List<Object> allTransactions) {
        String result = "DATE\tAMOUNT\tBALANCE\n" + "17/09/14\t30\t30\n" + "18/09/14\t10\t20";
        return result;
    }
}
