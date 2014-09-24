package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class Money {

    private final int amount;


    public Money(int amount) {
        if(amount < 0) {
            throw new RuntimeException("You cannot pass a negative value into Amount constructor");
        }
        this.amount = amount;
    }

    public void printValue() {
        System.out.print(getAmount());
    }

    public int getAmount() {
        return amount;
    }

}
