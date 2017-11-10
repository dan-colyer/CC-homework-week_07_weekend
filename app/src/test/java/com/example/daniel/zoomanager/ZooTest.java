package com.example.daniel.zoomanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 10/11/2017.
 */

public class ZooTest {

    Zoo zoo;

    Enclosure<Chicken> enclosureChickens;

    Chicken chicken1, chicken2;

    @Before
    public void before() {
        chicken1 = new Chicken("Hetty", 6.00);
        chicken2 = new Chicken("Tina", 5.40);
        enclosureChickens = new Enclosure<>();
        zoo = new Zoo();
    }

    // Test 1
    @Test
    public void testGetFunds() {
        assertEquals(0.00, zoo.getFunds(), 0.01);
    }

    // Test 2
    @Test
    public void testEnclosuresStartEmpty() {
        assertEquals(0, zoo.getNumberOfEnclosures());
    }

    // Test 3
    @Test
    public void testAddEnclosure() {
        enclosureChickens.add(chicken1);
        enclosureChickens.add(chicken2);
        zoo.addEnclosure(enclosureChickens);
        assertEquals(1, zoo.getNumberOfEnclosures());
    }

    // Test 4
    @Test
    public void testRemoveEnclosure() {
        enclosureChickens.add(chicken1);
        enclosureChickens.add(chicken2);
        zoo.addEnclosure(enclosureChickens);
        zoo.removeEnclosure(enclosureChickens);
        assertEquals(0, zoo.getNumberOfEnclosures());
    }

    // Test 5
    @Test
    public void testCountAnimals() {
        enclosureChickens.add(chicken1);
        enclosureChickens.add(chicken2);
        zoo.addEnclosure(enclosureChickens);
        assertEquals(2, zoo.countAnimals());
    }


}
