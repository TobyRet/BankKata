package com.codurance;

/**
 * Created by tobyretallick on 19/09/2014.
 */

public class StatementPrinterShould {


    private static TransactionDate transactionDate;
    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction WITHDRAW_£20 = new Transaction(-20);
    private static final Transaction TRANSFER_£20 = new Transaction(-10);
    private StatementPrinter statementPrinter;
    private CustomerTransactionsRepository customerTransactions;

//    @Test public void
//    send_each_transaction_to_Customer_Transactions_Collection() {
//
//        statementPrinter.printTransaction("17/09/14", 30);
//        verify(customerTransactions).add("17/09/14\t\t30");
//    }
}
