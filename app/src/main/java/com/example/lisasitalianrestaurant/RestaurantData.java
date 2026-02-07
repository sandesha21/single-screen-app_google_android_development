package com.example.lisasitalianrestaurant;

/**
 * Centralized data model for Lisa's Italian Restaurant information.
 * This class manages all restaurant details in one place for easy maintenance and testing.
 */
public class RestaurantData {
    public static final String RESTAURANT_NAME = "Lisa's Italian Restaurant";
    public static final String DESCRIPTION = "Welcome to Lisa's Italian Restaurant, where authentic Italian cuisine meets warm hospitality. Our family-owned establishment has been serving delicious traditional Italian dishes for over 20 years.";
    public static final String LOCATION = "123 Italian Street, Food City, FC 12345\n(Tap to view on map)";
    public static final String PHONE = "Phone: (555) 123-4567";
    public static final String EMAIL = "Email: info@lisasitalian.com";
    public static final String WEBSITE = "Website: www.lisasitalian.com";
    public static final String HOURS = "Hours:\nMonday - Thursday: 11:00 AM - 10:00 PM\nFriday - Saturday: 11:00 AM - 11:00 PM\nSunday: 12:00 PM - 9:00 PM";

    private RestaurantData() {
        // Utility class, no instantiation
    }

    /**
     * Get all restaurant information as a formatted string
     */
    public static String getFullInfo() {
        return RESTAURANT_NAME + "\n\n" +
                DESCRIPTION + "\n\n" +
                LOCATION + "\n" +
                PHONE + "\n" +
                EMAIL + "\n" +
                WEBSITE + "\n\n" +
                HOURS;
    }
}
