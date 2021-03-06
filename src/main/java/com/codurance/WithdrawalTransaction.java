package com.codurance;

public class WithdrawalTransaction implements Transaction {
    private final Money money;
    private final TransactionDate transactionDate;

    public WithdrawalTransaction(Money money, TransactionDate transactionDate) {
        this.money = money;
        this.transactionDate = transactionDate;
        money.isWithdrawal();
    }

    @Override
    public void print(StatementPrinter statementPrinter) {
        statementPrinter.printStatementLine(transactionDate, money);
    }
}
