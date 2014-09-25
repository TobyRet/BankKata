package com.codurance;

public class TransferTransaction implements Transaction {
    private final TransactionDate transactionDate;
    private final Money money;

    public TransferTransaction(Money money, TransactionDate transactionDate) {
        this.money = money;
        this.transactionDate = transactionDate;
        money.isTransfer();
    }

    @Override
    public void print(StatementPrinter statementPrinter) {
        statementPrinter.printStatementLine(transactionDate, money);
    }
}
