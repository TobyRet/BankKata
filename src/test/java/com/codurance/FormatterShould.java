package com.codurance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class FormatterShould {

    private Formatter formatter;
    private List<Object> transaction1;
    private List<Object> statement;
    private List<Object> transaction2;
    private String expectedFormattedStatement;

    @Test public void
    format_a_date() {
        // perhaps don't need a test for this? Check
    }

    @Test public void
    create_a_formatted_statement(){
        formatter = new Formatter();
        transaction1 = new ArrayList<>();
        transaction2 = new ArrayList<>();
        statement = new ArrayList<>();

        transaction1.add("17/09/14");
        transaction1.add(30);
        transaction1.add(30);

        transaction2.add("18/09/14");
        transaction2.add(10);
        transaction2.add(20);

        statement.add(transaction1);
        statement.add(transaction2);

        String heading1 = "DATE";
        String heading2 = "AMOUNT";
        String heading3 = "BALANCE";

        expectedFormattedStatement = "DATE\tAMOUNT\tBALANCE\n" + "17/09/14\t30\t30\n" + "18/09/14\t10\t20";

        assertThat(formatter.createFormattedStatement(statement), is(expectedFormattedStatement));
    }
}
