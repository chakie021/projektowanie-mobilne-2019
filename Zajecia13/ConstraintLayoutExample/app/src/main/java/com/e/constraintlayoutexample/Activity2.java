package com.e.constraintlayoutexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {

    List<Student> mStudents = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        recyclerView = findViewById(R.id.recyclerView);

        AppDatabase appDatabase = Room.databaseBuilder(this,AppDatabase.class,"baza").
                allowMainThreadQueries().build();

        StudentDao studentDao = appDatabase.studentDao();
        mStudents = studentDao.getStudents();

        if(mStudents.size()==0)
            for(int i=5;i<100;i++) {
                Student student = new Student("Imie" + i, "Nazwisko" + i);

                studentDao.insert(student);
                mStudents.add(student);
            }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SimpleListAdapter(mStudents));


    }
}
