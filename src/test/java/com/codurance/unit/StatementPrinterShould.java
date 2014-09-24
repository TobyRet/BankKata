package com.codurance.unit;

import com.codurance.Console;
import com.codurance.Money;
import com.codurance.StatementPrinter;
import com.codurance.TransactionDate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.time.LocalDate.of;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StatementPrinterShould {

    private static final TransactionDate DATE_24_09_2014 = new TransactionDate(of(2014, 9, 24));
    private static final Money TEN_POUNDS = new Money(10);
    private StatementPrinter statementPrinter;
    @Mock Console console;

    @Before
    public void
    initialize() {
        statementPrinter = new StatementPrinter(console);
    }

    @Test public void
    print_statement_column_headings() {
        statementPrinter.printColumnHeaders();

        verify(console).println("DATE       AMOUNT     BALANCE   \n");
    }

    @Test public void
    print_a_transaction_date_and_amount_in_the_statement_line() {
        statementPrinter.printStatementLine(DATE_24_09_2014, TEN_POUNDS);

        verify(console).println("24/09/2014 10.00     \n");
    }
}
