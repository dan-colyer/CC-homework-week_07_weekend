package com.example.daniel.zoomanager;

import java.util.ArrayList;

/**
 * Created by Daniel on 10/11/2017.
 */

public class Enclosure <T extends Animal> {

    ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList<T>();
    }

    public void add(T animal) {
        this.animals.add(animal);
    }
}


//public class Library <T> {
//
//    ArrayList<T> stock;
//
//    public Library() {
//        this.stock = new ArrayList<T>();
//    }
//
//    public void add(T item) {
//        this.stock.add(item);
//    }
//
//    public void remove(T item) {
//        this.stock.remove(item);
//    }