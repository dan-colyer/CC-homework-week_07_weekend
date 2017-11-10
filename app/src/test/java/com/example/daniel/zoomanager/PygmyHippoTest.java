package com.example.daniel.zoomanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 10/11/2017.
 */

public class PygmyHippoTest {

    PygmyHippo pygmyHippo;

    @Before
    public void before() {
        pygmyHippo = new PygmyHippo("Mavis Davis", 18000.00);
    }

    @Test
    public void testGetName() {
        assertEquals("Mavis Davis", pygmyHippo.getName());
    }
}
