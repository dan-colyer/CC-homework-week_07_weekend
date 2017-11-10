package com.example.daniel.zoomanager;

/**
 * Created by Daniel on 10/11/2017.
 */

public abstract class Animal {
    public String name;
    public double cashValue;

    public Animal(String name, double cashValue) {
        this.name = name;
        this.cashValue = cashValue;
    }

    public String getName() {
        return name;
    }

    public double getCashValue() {
        return cashValue;
    }
}
