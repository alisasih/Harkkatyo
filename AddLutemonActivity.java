package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.lang.String;

public class AddLutemonActivity extends AppCompatActivity {

    public EditText editName;

    public String color;
    public int image;
    public int attack, defend, newLife, life, experience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lutemon);

        //context = this;
    }

    public void addLutemon(View view) {

        editName = (EditText) findViewById(R.id.lutemonName);
        String name = editName.getText().toString();

        RadioGroup colorOptions = findViewById(R.id.rgChooseColor);
        switch (colorOptions.getCheckedRadioButtonId()) {
            case R.id.rbWhite:
                color = "Valkoinen";
                attack = 5;
                defend = 4;
                newLife = 20;
                life = 20;
                image = R.drawable.whitelutemon;
                break;
            case R.id.rbGreen:
                color = "Vihreä";
                attack = 6;
                defend = 3;
                newLife = 19;
                life = 19;
                image = R.drawable.greenlutemon;
                break;
            case R.id.rbPink:
                color = "Pinkki";
                attack = 7;
                defend = 2;
                newLife = 18;
                life = 18;
                image = R.drawable.pinklutemon;
                break;
            case R.id.rbOrange:
                color = "Oranssi";
                attack = 8;
                defend = 1;
                newLife = 17;
                life = 17;
                image = R.drawable.orangelutemon;
                break;
            case R.id.rbBlack:
                color = "Musta";
                attack = 9;
                defend = 0;
                newLife = 16;
                life = 16;
                image = R.drawable.blacklutemon;
                break;
        }
        experience = 0;
        LutemonStorage.getInstance().addLutemon(new Lutemon(name, color, attack, defend, newLife, life, experience, image));
    }
}