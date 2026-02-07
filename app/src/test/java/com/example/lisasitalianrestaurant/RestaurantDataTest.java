package com.example.lisasitalianrestaurant;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for RestaurantData class
 */
public class RestaurantDataTest {

    @Test
    public void testRestaurantNameNotEmpty() {
        assertNotNull("Restaurant name should not be null", RestaurantData.RESTAURANT_NAME);
        assertFalse("Restaurant name should not be empty", RestaurantData.RESTAURANT_NAME.isEmpty());
    }

    @Test
    public void testPhoneNumberNotEmpty() {
        assertNotNull("Phone number should not be null", RestaurantData.PHONE);
        assertFalse("Phone number should not be empty", RestaurantData.PHONE.isEmpty());
    }

    @Test
    public void testEmailNotEmpty() {
        assertNotNull("Email should not be null", RestaurantData.EMAIL);
        assertFalse("Email should not be empty", RestaurantData.EMAIL.isEmpty());
    }

    @Test
    public void testLocationNotEmpty() {
        assertNotNull("Location should not be null", RestaurantData.LOCATION);
        assertFalse("Location should not be empty", RestaurantData.LOCATION.isEmpty());
    }

    @Test
    public void testHoursNotEmpty() {
        assertNotNull("Hours should not be null", RestaurantData.HOURS);
        assertFalse("Hours should not be empty", RestaurantData.HOURS.isEmpty());
    }

    @Test
    public void testGetFullInfoContainsAllData() {
        String fullInfo = RestaurantData.getFullInfo();
        assertNotNull("Full info should not be null", fullInfo);
        assertTrue("Full info should contain restaurant name", fullInfo.contains(RestaurantData.RESTAURANT_NAME));
        assertTrue("Full info should contain phone", fullInfo.contains(RestaurantData.PHONE));
        assertTrue("Full info should contain email", fullInfo.contains(RestaurantData.EMAIL));
    }
}
