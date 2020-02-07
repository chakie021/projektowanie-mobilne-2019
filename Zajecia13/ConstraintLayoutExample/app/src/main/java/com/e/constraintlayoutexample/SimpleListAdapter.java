package com.e.constraintlayoutexample;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.SimpleViewHolder>{

    ArrayList<String> mItems;

    SimpleListAdapter(ArrayList<String> items){
        mItems = items;
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder{

        public SimpleViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
