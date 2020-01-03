package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Tytył okna");
        builder.setMessage("Przykładowy tekst okna dialogowego");

        AlertDialog dialog = builder.create();

        return dialog;
    }
}
