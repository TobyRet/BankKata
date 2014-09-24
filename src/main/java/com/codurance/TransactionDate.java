package com.codurance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionDate {
    private final LocalDate date;

    public TransactionDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
