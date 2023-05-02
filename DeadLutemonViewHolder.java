package com.example.harkkatyo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeadLutemonViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView2;
    TextView lutemonName2, attack2, defend2, life2, experience2;

    public DeadLutemonViewHolder(@NonNull View itemView) {
        super(itemView);

        lutemonName2 = itemView.findViewById(R.id.txtName2);
        attack2 = itemView.findViewById(R.id.txtAttack2);
        defend2 = itemView.findViewById(R.id.txtDefend2);
        life2 = itemView.findViewById(R.id.txtLife2);
        experience2 = itemView.findViewById(R.id.txtExperience2);
        imageView2 = itemView.findViewById(R.id.ivLutemon2);

    }
}
