package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TrainingAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_area);
        makeRadioButtons();
    }

    public void makeRadioButtons() {
        RadioGroup rgLutemon = findViewById(R.id.rgLutemonA);

        ArrayList<Lutemon> lutemons = LutemonStorage.getInstance().getLutemons();

        RadioButton rb;
        int i = 0;
        for (Lutemon l : lutemons) {
            rb = new RadioButton(this);
            rb.setText(l.getName() + " (" +l.getColor() + ") ");
            rb.setId(i++);
            rgLutemon.addView(rb);
        }
    }

    public void trainLutemon(View view) {
        RadioGroup rgLutemon = findViewById(R.id.rgLutemonA);
        TextView txtLutemonMessage = findViewById(R.id.txtLutemonMessage);

        Lutemon lutemonFromStorage = LutemonStorage.getInstance().getLutemonById(rgLutemon.getCheckedRadioButtonId());
        lutemonFromStorage.trainLutemon(txtLutemonMessage);
    }
}