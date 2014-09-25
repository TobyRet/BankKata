package com.codurance;

public class BankService {

    private TransactionsRepository transactionsRepository;
    private StatementPrinter statementPrinter;

    public BankService(TransactionsRepository transactionsRepository, StatementPrinter statementPrinter) {
        this.transactionsRepository = transactionsRepository;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(Money money, TransactionDate date) {
        transactionsRepository.store(new DepositTransaction(money, date));
    }

    public void withdraw(Money money, TransactionDate date) {
        transactionsRepository.store(new WithdrawalTransaction(money, date));
    }

    public void printStatement() {
        transactionsRepository.printTransactions(statementPrinter);
    }
}
