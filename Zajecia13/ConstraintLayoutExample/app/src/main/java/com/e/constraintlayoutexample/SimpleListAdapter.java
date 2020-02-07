package com.e.constraintlayoutexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.SimpleViewHolder>{

    ArrayList<Student> mItems;

    SimpleListAdapter(ArrayList<Student> items){
        mItems = items;
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new SimpleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        holder.name.setText(mItems.get(position).getName());
        holder.surname.setText(mItems.get(position).getSurname());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder{

        final TextView name;
        final TextView surname;

        public SimpleViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            surname = itemView.findViewById(R.id.surname);
        }
    }
}
