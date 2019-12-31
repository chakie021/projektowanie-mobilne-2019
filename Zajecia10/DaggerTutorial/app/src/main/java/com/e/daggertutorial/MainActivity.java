package com.e.daggertutorial;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject MyExample myExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTextView = findViewById(R.id.tvDate);

        ((MyApplication)getApplication()).getMyComponent().f0(MainActivity.this);

        dateTextView.setText((new Date(myExample.getDate())).toString());
    }
}
