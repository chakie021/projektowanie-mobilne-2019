package com.e.constraintlayoutexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button0 = findViewById(R.id.button1);
        final Button button1 = findViewById(R.id.button2);

        button0.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });

        button1.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });
    }
}
