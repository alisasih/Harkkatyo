package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MoveLutemonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_lutemon);
    }

    public void switchToLutemonHomeActivity(View view) {
        Intent intent = new Intent(this, LutemonHomeActivity.class);
        startActivity(intent);
    }

    public void switchToDeadLutemonActivity(View view) {
        Intent intent = new Intent(this, DeadLutemonActivity.class);
        startActivity(intent);
    }

}