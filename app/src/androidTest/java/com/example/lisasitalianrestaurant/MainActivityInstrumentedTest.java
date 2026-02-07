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
 * These tests run on an Android device or emulator
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testMainActivityLaunches() {
        // Verify the activity launches without crashing
        activityRule.getScenario();
    }

    @Test
    public void testMainActivityLayoutLoads() {
        // Verify that the pizza emoji header is displayed
        onView(withId(R.id.pizza_emoji)).check(matches(isDisplayed()));
    }

    @Test
    public void testDescriptionTextDisplayed() {
        // Verify description text is visible
        onView(withId(R.id.description)).check(matches(isDisplayed()));
    }

    @Test
    public void testLocationTextDisplayed() {
        // Verify location text is visible
        onView(withId(R.id.location)).check(matches(isDisplayed()));
    }

    @Test
    public void testPhoneTextDisplayed() {
        // Verify phone text is visible
        onView(withId(R.id.phone)).check(matches(isDisplayed()));
    }

    @Test
    public void testEmailTextDisplayed() {
        // Verify email text is visible
        onView(withId(R.id.email)).check(matches(isDisplayed()));
    }

    @Test
    public void testWebsiteTextDisplayed() {
        // Verify website text is visible
        onView(withId(R.id.url)).check(matches(isDisplayed()));
    }

    @Test
    public void testHoursTextDisplayed() {
        // Verify hours text is visible
        onView(withId(R.id.hours)).check(matches(isDisplayed()));
    }
}
