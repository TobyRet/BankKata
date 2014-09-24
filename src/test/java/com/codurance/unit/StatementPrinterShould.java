package com.codurance.unit;

import com.codurance.StatementPrinter;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 24/09/2014.
 */
public class StatementPrinterShould {

    private StatementPrinter statementPrinter;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void
    setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test public void
    print_statement_column_headings() {
        statementPrinter = new StatementPrinter();
        statementPrinter.printColumnHeaders();
        assertThat(outContent.toString(), CoreMatchers.allOf(
                containsString("Date"),
                containsString("Debit"),
                containsString("Credit"),
                containsString("Balance")));
    }

    @After
    public void
    cleanUpSystems() {
        System.setOut(null);
    }
}
