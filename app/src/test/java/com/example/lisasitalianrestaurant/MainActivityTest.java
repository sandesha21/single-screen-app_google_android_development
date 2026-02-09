package com.example.lisasitalianrestaurant;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Unit tests for MainActivity
 * 
 * These tests verify basic properties of the MainActivity class:
 * - The class exists and is not null
 * - The class properly extends AppCompatActivity
 * 
 * Note: These are local unit tests that run on the JVM without
 * requiring an Android device or emulator. For UI testing, see
 * MainActivityInstrumentedTest which runs on Android devices.
 */
public class MainActivityTest {

    /**
     * Setup method called before each test
     * Can be used to initialize test fixtures or mock objects
     */
    @Before
    public void setUp() {
        // Setup code if needed
    }

    /**
     * Test that MainActivity class exists and is not null
     */
    @Test
    public void testMainActivityNotNull() {
        assertNotNull("MainActivity should not be null", MainActivity.class);
    }

    /**
     * Test that MainActivity properly extends AppCompatActivity
     * This ensures the activity has access to AppCompat features
     * like Material Design components and backward compatibility
     */
    @Test
    public void testMainActivityIsAppCompatActivity() {
        assertTrue("MainActivity should extend AppCompatActivity",
                androidx.appcompat.app.AppCompatActivity.class.isAssignableFrom(MainActivity.class));
    }
}
