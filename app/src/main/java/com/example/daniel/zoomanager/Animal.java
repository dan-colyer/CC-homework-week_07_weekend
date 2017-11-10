package com.example.daniel.zoomanager;

/**
 * Created by Daniel on 10/11/2017.
 */

public abstract class Animal {
    public String name;
    public double cash_value;

    public Animal(String name, double cash_value) {
        this.name = name;
        this.cash_value = cash_value;
    }

    public String getName() {
        return name;
    }
}
