package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListLutemonActivity extends AppCompatActivity {

    private LutemonStorage lutemonstorage;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lutemon);

        lutemonstorage = LutemonStorage.getInstance();
        recyclerview = findViewById(R.id.rvLutemonList);

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(new LutemonListAdapter(getApplicationContext(),lutemonstorage.getLutemons()));
    }
}