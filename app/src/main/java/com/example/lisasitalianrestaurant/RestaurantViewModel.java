package com.example.lisasitalianrestaurant;

import androidx.lifecycle.ViewModel;

/**
 * ViewModel for managing restaurant data and business logic.
 * This separates UI logic from data management for better testability and lifecycle handling.
 */
public class RestaurantViewModel extends ViewModel {

    /**
     * Get restaurant name
     */
    public String getRestaurantName() {
        return RestaurantData.RESTAURANT_NAME;
    }

    /**
     * Get restaurant description
     */
    public String getDescription() {
        return RestaurantData.DESCRIPTION;
    }

    /**
     * Get restaurant location
     */
    public String getLocation() {
        return RestaurantData.LOCATION;
    }

    /**
     * Get restaurant phone number
     */
    public String getPhone() {
        return RestaurantData.PHONE;
    }

    /**
     * Get restaurant email
     */
    public String getEmail() {
        return RestaurantData.EMAIL;
    }

    /**
     * Get restaurant website
     */
    public String getWebsite() {
        return RestaurantData.WEBSITE;
    }

    /**
     * Get restaurant hours
     */
    public String getHours() {
        return RestaurantData.HOURS;
    }

    /**
     * Get all restaurant information
     */
    public String getFullInfo() {
        return RestaurantData.getFullInfo();
    }
}
