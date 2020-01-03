package com.example.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);


        button0.setOnClickListener((View view)->{
            openDialog0();
        });
        button1.setOnClickListener((View view)->{
            openDialog1();
        });
        button2.setOnClickListener((View view)->{
            openDialog2();
        });
        button3.setOnClickListener((View view)->{
            openDialog3();
        });

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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tytył okna");
        builder.setMessage("Przykładowy tekst okna dialogowego");


        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout,null);

        builder.setView(view);

        AlertDialog dialog = builder.create();

        dialog.show();
    }

    private void openDialog3(){

    }
}
