package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DeadLutemonActivity extends AppCompatActivity {

    private LutemonStorage lutemonStorage;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead_lutemon);

        lutemonStorage = LutemonStorage.getInstance();
        recyclerView = findViewById(R.id.rvDeadLutemons);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DeadLutemonAdapter(getApplicationContext(),lutemonStorage.getDeadLutemons()));
    }


}