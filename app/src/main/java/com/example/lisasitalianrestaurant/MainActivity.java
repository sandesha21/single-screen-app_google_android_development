package com.example.lisasitalianrestaurant;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

/**
 * MainActivity - Main activity for Lisa's Italian Restaurant app
 * 
 * This activity serves as the entry point for the application and displays
 * comprehensive restaurant information including:
 * - Restaurant name and branding
 * - Business description
 * - Contact information (phone, email, website)
 * - Location details
 * - Hours of operation
 * - Restaurant images
 * 
 * The activity handles system insets to ensure content is properly positioned
 * below the status bar and applies the app's theme colors to the status bar.
 * 
 * Architecture: This activity uses a ViewModel pattern (RestaurantViewModel)
 * for better separation of concerns and testability. Restaurant data is managed
 * through RestaurantData model and accessed via RestaurantViewModel.
 */
public class MainActivity extends AppCompatActivity {

    private RestaurantViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configure window to draw system bar backgrounds
        // This allows us to set custom colors for status bar and navigation bar
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);

        // Solid system bars - ensure system bars have solid backgrounds
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Load the main activity layout
        setContentView(R.layout.activity_main);

        // Set status bar background color to match app theme (headerGreen)
        // This creates a cohesive visual experience with the app's branding
        getWindow().setStatusBarColor(getColor(R.color.headerGreen));

        // Initialize ViewModel for managing restaurant data
        viewModel = new ViewModelProvider(this).get(RestaurantViewModel.class);

        // Populate UI with restaurant data from ViewModel
        populateRestaurantData();

        // Get reference to the header view to apply insets
        final View header = findViewById(R.id.header);

        // Store original padding values to preserve them
        final int left = header.getPaddingLeft();
        final int top = header.getPaddingTop();
        final int right = header.getPaddingRight();
        final int bottom = header.getPaddingBottom();

        // Apply window insets listener to handle system bars (status bar, navigation bar)
        // This ensures the header doesn't get hidden behind the status bar
        ViewCompat.setOnApplyWindowInsetsListener(header, (v, insets) -> {
            // Get the height of the status bar
            Insets status = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            
            // Apply top padding to push content below the status bar
            // Preserves original left, right, and bottom padding
            v.setPadding(left, top + status.top, right, bottom);
            
            // Return insets to allow other views to handle them
            return insets;
        });
    }

    /**
     * Populates the UI with restaurant data from the ViewModel
     * This method retrieves data from RestaurantViewModel and sets it to the appropriate views
     */
    private void populateRestaurantData() {
        // Set description text
        TextView descriptionView = findViewById(R.id.description);
        descriptionView.setText(viewModel.getDescription());

        // Set location text with prefix
        TextView locationView = findViewById(R.id.location);
        locationView.setText("Location: " + viewModel.getLocation());

        // Set phone text
        TextView phoneView = findViewById(R.id.phone);
        phoneView.setText(viewModel.getPhone());

        // Set email text
        TextView emailView = findViewById(R.id.email);
        emailView.setText(viewModel.getEmail());

        // Set website text
        TextView urlView = findViewById(R.id.url);
        urlView.setText(viewModel.getWebsite());

        // Set hours text
        TextView hoursView = findViewById(R.id.hours);
        hoursView.setText(viewModel.getHours());
    }
}
