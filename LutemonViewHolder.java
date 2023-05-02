package com.example.harkkatyo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView lutemonName, attack, defend, life, experience;

    public LutemonViewHolder(@NonNull View itemView) {
        super(itemView);

        lutemonName = itemView.findViewById(R.id.txtName);
        attack = itemView.findViewById(R.id.txtAttack2);
        defend = itemView.findViewById(R.id.txtDefend2);
        life = itemView.findViewById(R.id.txtLife2);
        experience = itemView.findViewById(R.id.txtExperience2);
        imageView = itemView.findViewById(R.id.ivLutemon2);

    }
}