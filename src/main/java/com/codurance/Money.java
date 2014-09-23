package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class Money {

    private final int amount;


    public Money(int amount) {
        this.amount = amount;
    }

    public void printAmount() {
        System.out.print(getAmount());
    }

    public int getAmount() {
        return amount;
    }

}
