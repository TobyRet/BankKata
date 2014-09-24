package com.codurance;

/**
 * Created by tobyretallick on 24/09/2014.
 */
public class DepositTransaction implements Transaction {
    private TransactionDate transactionDate;
    private Money money;

    public DepositTransaction(Money money, TransactionDate transactionDate) {
        this.money = money;
        this.transactionDate = transactionDate;
    }

    @Override
    public void print(StatementPrinter statementPrinter) {
        statementPrinter.printStatement(transactionDate, money);
    }
}
