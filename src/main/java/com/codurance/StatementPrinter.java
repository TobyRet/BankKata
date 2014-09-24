package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class StatementPrinter {

   public void printStatement(TransactionDate date, Money money) {
//        printColumnHeaders();
//        printDate(date);
//        printAmount(money);
//        printBalance(money);
    }

    public void printColumnHeaders() {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Date", "Debit", "Credit", "Balance");
    }
}