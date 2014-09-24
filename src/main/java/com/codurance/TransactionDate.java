package com.codurance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
