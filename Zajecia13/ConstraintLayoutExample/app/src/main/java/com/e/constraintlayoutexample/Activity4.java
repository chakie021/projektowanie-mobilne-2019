package com.e.constraintlayoutexample;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_activity);

        frameLayout = findViewById(R.id.container);
        frameLayout.setBackgroundColor(Color.CYAN);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new Fragment2())
                    .commitNow();
        }
    }
}
