package com.codurance;

import java.text.DecimalFormat;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class Money {

    private final int amount;


    public Money(int amount) {
        if(amount < 0) {
            throw new RuntimeException("You cannot pass a negative value into Amount constructor");
        }
        this.amount = amount;
    }

//    public void printValue(StatementPrinter statementPrinter) {
//        statementPrinter.printAmount(amountAsString(amount));
//    }

//    private String amountAsString(int amount) {
//        return "" + amount;
//    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(amount);
    }
}
