package com.example.lisasitalianrestaurant;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Instrumented tests for MainActivity
 * 
 * These tests run on an Android device or emulator and verify that:
 * - The activity launches successfully without crashing
 * - All UI elements are properly displayed
 * - The layout renders correctly
 * 
 * Tests use Espresso framework for UI testing and ActivityScenarioRule
 * for managing the activity lifecycle during tests.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Test that MainActivity launches without crashing
     */
    @Test
    public void testMainActivityLaunches() {
        // Verify the activity launches without crashing
        activityRule.getScenario();
    }

    /**
     * Test that the header is displayed
     * The header contains the restaurant name and pizza icon
     */
    @Test
    public void testHeaderDisplayed() {
        // Verify that the header is visible
        onView(withId(R.id.header)).check(matches(isDisplayed()));
    }

    /**
     * Test that the title text is displayed in the header
     */
    @Test
    public void testTitleTextDisplayed() {
        // Verify title text is visible
        onView(withId(R.id.title)).check(matches(isDisplayed()));
    }

    /**
     * Test that the main background image is displayed
     */
    @Test
    public void testMainImageDisplayed() {
        // Verify main background image is visible
        onView(withId(R.id.main_background)).check(matches(isDisplayed()));
    }

    /**
     * Test that the description text is displayed
     */
    @Test
    public void testDescriptionTextDisplayed() {
        // Verify description text is visible
        onView(withId(R.id.description)).check(matches(isDisplayed()));
    }

    /**
     * Test that the location text is displayed
     */
    @Test
    public void testLocationTextDisplayed() {
        // Verify location text is visible
        onView(withId(R.id.location)).check(matches(isDisplayed()));
    }

    /**
     * Test that the phone text is displayed
     */
    @Test
    public void testPhoneTextDisplayed() {
        // Verify phone text is visible
        onView(withId(R.id.phone)).check(matches(isDisplayed()));
    }

    /**
     * Test that the email text is displayed
     */
    @Test
    public void testEmailTextDisplayed() {
        // Verify email text is visible
        onView(withId(R.id.email)).check(matches(isDisplayed()));
    }

    /**
     * Test that the website text is displayed
     */
    @Test
    public void testWebsiteTextDisplayed() {
        // Verify website text is visible
        onView(withId(R.id.url)).check(matches(isDisplayed()));
    }

    /**
     * Test that the hours text is displayed
     */
    @Test
    public void testHoursTextDisplayed() {
        // Verify hours text is visible
        onView(withId(R.id.hours)).check(matches(isDisplayed()));
    }

    /**
     * Test that the bottom image is displayed
     */
    @Test
    public void testBottomImageDisplayed() {
        // Verify bottom image is visible
        onView(withId(R.id.bottom_image)).check(matches(isDisplayed()));
    }
}
