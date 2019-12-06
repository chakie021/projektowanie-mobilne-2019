package com.android7.activitycommunicationdialogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "name";
    public static final String KEY_SURNAME = "nazwisko";

    public static final int RESULT_CHILD = 10;

    EditText mEditName;
    EditText mEditSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        mEditName = findViewById(R.id.edit_name);
        mEditSurname = findViewById(R.id.edit_surname);

        mEditName.setText("Przemysław");
        mEditSurname.setText("Stokłosa");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(MainActivity.this,ChildActivity.class);
                intent.putExtra(KEY_NAME,mEditName.getText().toString());
                intent.putExtra(KEY_SURNAME,mEditSurname.getText().toString());

                startActivityForResult(intent, RESULT_CHILD);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode== RESULT_CHILD){

            if(resultCode == RESULT_OK) {
                Toast.makeText(this, "Save data: "+data.getIntExtra("waga",0), Toast.LENGTH_LONG).show();

            }
            if(resultCode == RESULT_CANCELED)
                Toast.makeText(this,"Result canceled",Toast.LENGTH_LONG).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
