package com.codurance.unit;

import com.codurance.Money;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


/**
 * Created by tobyretallick on 23/09/2014.
 */
public class MoneyShould {

    private static final int £10 = 10;
    private Money money;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void
    print_amount_to_console() {
        money = new Money(£10);
        money.printAmount();
        assertEquals("10", outContent.toString());
    }

    @After
    public void cleanUpSystems() {
        System.setOut(null);
    }

}
