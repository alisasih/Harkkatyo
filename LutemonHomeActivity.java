package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class LutemonHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lutemon_home);
        makeRadiobuttons2();
    }

    public void makeRadiobuttons2() {
        RadioGroup rgExistingLutemons = findViewById(R.id.rgExistingLutemons);
        ArrayList<Lutemon> lutemons = LutemonStorage.getInstance().getLutemons();

        RadioButton rb;
        int j = 0;
        for (Lutemon el : lutemons) {
            rb = new RadioButton(this);
            rb.setId(j++);
            rb.setText(el.getName() + " (" + el.getColor() + ")");
            rgExistingLutemons.addView(rb);
        }
    }

    public void healLutemon(View view) {
        RadioGroup rgExistingLutemons = findViewById(R.id.rgExistingLutemons);
        TextView txtHealLutemonMessage = findViewById(R.id.txtHealLutemonMessage);

        Lutemon chosenLutemon = LutemonStorage.getInstance().getLutemonById(rgExistingLutemons.getCheckedRadioButtonId());
        chosenLutemon.healLutemon(txtHealLutemonMessage);
    }
}