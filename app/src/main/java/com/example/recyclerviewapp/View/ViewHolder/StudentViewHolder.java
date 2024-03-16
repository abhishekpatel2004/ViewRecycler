package com.example.recyclerviewapp.View.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.R;


public class StudentViewHolder extends RecyclerView.ViewHolder {

    public TextView txtViewName;
    public TextView txtViewAge;
    public ImageView image;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        txtViewName = itemView.findViewById(R.id.textViewName);
        txtViewAge = itemView.findViewById(R.id.textViewAge);
        image=itemView.findViewById(R.id.Fimage);
    }
}
