package com.codurance;

/**
 * Created by tobyretallick on 24/09/2014.
 */
public class WithdrawalTransaction implements Transaction {
    private final Money money;
    private final TransactionDate transactionDate;

    public WithdrawalTransaction(Money money, TransactionDate transactionDate) {
        this.money = money;
        this.transactionDate = transactionDate;
    }

    @Override
    public void print(StatementPrinter statementPrinter) {
        statementPrinter.printStatement(transactionDate, money);
    }
}
