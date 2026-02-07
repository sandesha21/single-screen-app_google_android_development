package com.example.lisasitalianrestaurant;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Unit tests for MainActivity
 */
public class MainActivityTest {

    @Before
    public void setUp() {
        // Setup code if needed
    }

    @Test
    public void testMainActivityNotNull() {
        assertNotNull("MainActivity should not be null", MainActivity.class);
    }

    @Test
    public void testMainActivityIsAppCompatActivity() {
        assertTrue("MainActivity should extend AppCompatActivity",
                androidx.appcompat.app.AppCompatActivity.class.isAssignableFrom(MainActivity.class));
    }
}
