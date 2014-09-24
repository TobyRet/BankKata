package com.codurance.unit;

import com.codurance.TransactionDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionDateShould {

    private TransactionDate transactionDate;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void
    setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test public void
    create_a_new_formatted_date() {
        transactionDate = new TransactionDate();
        assertTrue(transactionDate.create().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}"));
    }

    @Test public void
    print_date_to_console() {
        transactionDate = new TransactionDate();
        transactionDate.printValue();
        assertTrue(outContent.toString().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}"));
    }

    @After
    public void
    cleanUpSystems() {
        System.setOut(null);
    }
}
