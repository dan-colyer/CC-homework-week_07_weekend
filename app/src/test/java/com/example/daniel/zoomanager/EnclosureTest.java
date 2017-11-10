package com.example.daniel.zoomanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 10/11/2017.
 */

public class EnclosureTest {

    PygmyHippo pygmyHippo;
    Enclosure<PygmyHippo> enclosurePygmyHippos;

    PolarBear polarBear;
    Enclosure<PolarBear> enclosurePolarBears;

    Chicken chicken;
    Enclosure<Chicken> enclosureChickens;


    @Before
    public void before() {
        pygmyHippo = new PygmyHippo("Gloria Gaynor", 18000.00);
        enclosurePygmyHippos = new Enclosure<PygmyHippo>();

        polarBear = new PolarBear("Diana Ross", 40000.00);
        enclosurePolarBears = new Enclosure<PolarBear>();

        chicken = new Chicken("Hetty", 6.00);
        enclosureChickens = new Enclosure<Chicken>();
    }

    // Test 1
    @Test
    public void testEnclosureStartsEmpty() {
        assertEquals(0, enclosurePygmyHippos.getNumberOfAnimals());
        assertEquals(0, enclosurePolarBears.getNumberOfAnimals());
        assertEquals(0, enclosureChickens.getNumberOfAnimals());
    }

    // Test 2
    @Test
    public void testAdd() {
        enclosurePygmyHippos.add(pygmyHippo);
        assertEquals(1, enclosurePygmyHippos.getNumberOfAnimals());

        enclosurePolarBears.add(polarBear);
        assertEquals(1, enclosurePolarBears.getNumberOfAnimals());

        enclosureChickens.add(chicken);
        assertEquals(1, enclosureChickens.getNumberOfAnimals());
    }

    // Test 3
    @Test
    public void testRemove() {
        enclosurePygmyHippos.add(pygmyHippo);
        enclosurePygmyHippos.remove(pygmyHippo);
        assertEquals(0, enclosurePygmyHippos.getNumberOfAnimals());
    }
}
