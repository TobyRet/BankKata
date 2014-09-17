package com.codurance;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by tobyretallick on 17/09/2014.
 */
public class Formatter {

    private static Date dateToday;
    private static DateFormat dateFormatter;

    public String createFormattedDateStamp() {
        dateToday = new Date();
        dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormatter.format(dateToday);
    }
}
