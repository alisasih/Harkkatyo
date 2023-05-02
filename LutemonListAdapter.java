package com.example.harkkatyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();
    public LutemonListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {
        holder.lutemonName.setText(lutemons.get(position).getName() + " (" + lutemons.get(position).getColor() + ") ");
        holder.attack.setText(" Hyökkäys: " + lutemons.get(position).getAttack());
        holder.defend.setText(" Puolustus: " + lutemons.get(position).getDefend());
        holder.life.setText(" Elämä: " + lutemons.get(position).getNewLife() + " / " + lutemons.get(position).getLife());
        holder.experience.setText(" Kokemus: " + lutemons.get(position).getExperience());
        holder.imageView.setImageResource(lutemons.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}