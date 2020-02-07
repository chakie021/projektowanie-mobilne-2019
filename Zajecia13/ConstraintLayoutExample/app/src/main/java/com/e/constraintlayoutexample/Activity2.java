package com.e.constraintlayoutexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity2 extends AppCompatActivity {

    ArrayList<String> mStudentNames = new ArrayList<>(Arrays.asList("Imie1","Imie2","Imie3","Imie4"));

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        recyclerView = findViewById(R.id.recyclerView);

        for(int i=5;i<100;i++)
            mStudentNames.add("Imie"+i);


    }
}
