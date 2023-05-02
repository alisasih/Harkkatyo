package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAddLutemonActivity(View view) {
        Intent intent = new Intent(this, AddLutemonActivity.class);
        startActivity(intent);
    }

    public void switchToListLutemonActivity(View view) {
        Intent intent = new Intent(this,ListLutemonActivity.class);
        startActivity(intent);
    }
    public void switchToMoveLutemonActivity(View view) {
        Intent intent = new Intent(this, MoveLutemonActivity.class);
        startActivity(intent);
    }

    public void switchToBattleFieldActivity(View view) {
        Intent intent = new Intent(this, BattleFieldActivity.class);
        startActivity(intent);
    }
    public void switchToTrainingAreaActivity(View view) {
        Intent intent = new Intent(this, TrainingAreaActivity.class);
        startActivity(intent);
    }

}