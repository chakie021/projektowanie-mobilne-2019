package com.example.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;

    View.OnClickListener button0Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openDialog0();
        }
    };

    View.OnClickListener button1Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openDialog1();
        }
    };

    View.OnClickListener button2Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openDialog2();
        }
    };

    View.OnClickListener button3Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openDialog3();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button0.setOnClickListener(button0Click);
        button1.setOnClickListener(button1Click);
        button2.setOnClickListener(button2Click);
        button3.setOnClickListener(button3Click);

    }

    private void openDialog0(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tytył okna");
        builder.setMessage("Przykładowy tekst okna dialogowego");

        AlertDialog dialog = builder.create();

        dialog.show();
    }

    private void openDialog1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Okno z przyciskami");
        builder.setMessage("Czy dane mają zostać zapisane?");

        builder.setPositiveButton("Tak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.setNegativeButton("Nie", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void openDialog2(){

    }

    private void openDialog3(){

    }
}
