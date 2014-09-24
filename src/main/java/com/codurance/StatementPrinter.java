package com.codurance;

import java.util.Formatter;

public class StatementPrinter {

    private Console console;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    public void printStatementLine(TransactionDate transactionDate, Money money) {
        Formatter formatter = new Formatter();
        Formatter line = formatter.format("%-10s %-10s\n", transactionDate.toString(), money.toString());
        console.println(line.toString());
    }

    public void printColumnHeaders() {
        Formatter formatter = new Formatter();
        Formatter header = formatter.format("%-10s %-10s %-10s\n", "DATE", "AMOUNT", "BALANCE");
        console.println(header.toString());
    }
}