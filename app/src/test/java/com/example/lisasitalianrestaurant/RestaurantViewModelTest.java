package com.example.lisasitalianrestaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for RestaurantViewModel
 */
public class RestaurantViewModelTest {

    private RestaurantViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new RestaurantViewModel();
    }

    @Test
    public void testGetRestaurantName() {
        String name = viewModel.getRestaurantName();
        assertNotNull("Restaurant name should not be null", name);
        assertEquals("Restaurant name should match", RestaurantData.RESTAURANT_NAME, name);
    }

    @Test
    public void testGetDescription() {
        String description = viewModel.getDescription();
        assertNotNull("Description should not be null", description);
        assertFalse("Description should not be empty", description.isEmpty());
    }

    @Test
    public void testGetLocation() {
        String location = viewModel.getLocation();
        assertNotNull("Location should not be null", location);
        assertFalse("Location should not be empty", location.isEmpty());
    }

    @Test
    public void testGetPhone() {
        String phone = viewModel.getPhone();
        assertNotNull("Phone should not be null", phone);
        assertTrue("Phone should contain digits", phone.matches(".*\\d.*"));
    }

    @Test
    public void testGetEmail() {
        String email = viewModel.getEmail();
        assertNotNull("Email should not be null", email);
        assertTrue("Email should contain @", email.contains("@"));
    }

    @Test
    public void testGetWebsite() {
        String website = viewModel.getWebsite();
        assertNotNull("Website should not be null", website);
        assertTrue("Website should contain www", website.contains("www"));
    }

    @Test
    public void testGetHours() {
        String hours = viewModel.getHours();
        assertNotNull("Hours should not be null", hours);
        assertFalse("Hours should not be empty", hours.isEmpty());
    }

    @Test
    public void testGetFullInfo() {
        String fullInfo = viewModel.getFullInfo();
        assertNotNull("Full info should not be null", fullInfo);
        assertTrue("Full info should contain name", fullInfo.contains(viewModel.getRestaurantName()));
        assertTrue("Full info should contain phone", fullInfo.contains(viewModel.getPhone()));
    }
}
