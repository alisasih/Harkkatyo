package com.example.harkkatyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DeadLutemonAdapter extends RecyclerView.Adapter<DeadLutemonViewHolder> {

    private Context context;
    private ArrayList<DeadLutemon> deadLutemons = new ArrayList<>();
    public DeadLutemonAdapter(Context context, ArrayList<DeadLutemon> deadLutemons) {
        this.context = context;
        this.deadLutemons = deadLutemons;
    }

    @NonNull
    @Override
    public DeadLutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DeadLutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.deadlutemon_view, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DeadLutemonViewHolder holder, int position) {
        holder.lutemonName2.setText(deadLutemons.get(position).getName() + " (" + deadLutemons.get(position).getColor() + ") ");
        holder.attack2.setText(" Hyökkäys: " + deadLutemons.get(position).getAttack());
        holder.defend2.setText(" Puolustus: " + deadLutemons.get(position).getDefend());
        holder.life2.setText(" Elämä: " + deadLutemons.get(position).getNewLife() + " / " + deadLutemons.get(position).getLife());
        holder.experience2.setText(" Kokemus: " + deadLutemons.get(position).getExperience());
        holder.imageView2.setImageResource(deadLutemons.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return deadLutemons.size();
    }
}
