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
        final Button button2 = findViewById(R.id.button3);
        final Button button3 = findViewById(R.id.button4);

        button0.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });

        button1.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Activity4.class);
            startActivity(intent);
        });
    }
}
