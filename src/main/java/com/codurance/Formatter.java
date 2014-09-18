package com.codurance;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

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

    public List<Object> createFormattedStatement(List<Object> objects) {
        return null;
    }
}
