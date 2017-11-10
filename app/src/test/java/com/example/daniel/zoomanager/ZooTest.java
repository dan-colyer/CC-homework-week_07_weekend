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
    public void testEnclosuresStartEmpty() {
        assertEquals(0, zoo.getNumberOfEnclosures());
    }

}
