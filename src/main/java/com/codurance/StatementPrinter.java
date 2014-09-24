package com.codurance;

import java.text.DecimalFormat;
import java.util.Formatter;

public class StatementPrinter {

    private Console console;
    private Double balance = 0.00;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    public void printStatementLine(TransactionDate transactionDate, Money money) {
        Formatter formatter = new Formatter();
        Formatter line = formatter.format("%-11s %-11s %-11s\n", transactionDate.toString(), money.toString(), updateBalance(money));
        console.println(line.toString());
    }

    private String updateBalance(Money money) {
        Double amount = Double.parseDouble(money.toString());
        balance += amount;
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(balance);
    }

    public void printColumnHeaders() {
        Formatter formatter = new Formatter();
        Formatter header = formatter.format("%-10s %-10s %-10s\n", "DATE", "AMOUNT", "BALANCE");
        console.println(header.toString());
    }
}