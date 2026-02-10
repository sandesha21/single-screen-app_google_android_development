package com.example.lisasitalianrestaurant;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * MainActivity - Main activity for Lisa's Italian Restaurant app
 * 
 * Displays restaurant information including description, contact details,
 * location, hours, and images. Handles system window insets to ensure
 * content displays properly below the status bar.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configure window to draw system bar backgrounds
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Load layout
        setContentView(R.layout.activity_main);

        // Set status bar color to match app theme
        getWindow().setStatusBarColor(getColor(R.color.headerGreen));

        // Handle system insets for header
        final View header = findViewById(R.id.header);
        final int left = header.getPaddingLeft();
        final int top = header.getPaddingTop();
        final int right = header.getPaddingRight();
        final int bottom = header.getPaddingBottom();

        ViewCompat.setOnApplyWindowInsetsListener(header, (v, insets) -> {
            Insets status = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            v.setPadding(left, top + status.top, right, bottom);
            return insets;
        });
    }
}
