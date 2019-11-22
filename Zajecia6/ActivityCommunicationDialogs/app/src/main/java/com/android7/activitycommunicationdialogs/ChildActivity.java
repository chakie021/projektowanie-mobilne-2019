package com.android7.activitycommunicationdialogs;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {
    TextView mName;
    TextView mSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mName = findViewById(R.id.name);
        mSurname = findViewById(R.id.surname);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String name = bundle.getString(MainActivity.KEY_NAME);
            String surname = bundle.getString(MainActivity.KEY_SURNAME);

            mName.setText(name);
            mSurname.setText(surname);

            //Toast.makeText(this,name+" "+surname,Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
