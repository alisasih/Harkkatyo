package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class BattleFieldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_field);
        makeCheckBoxesA();
        makeCheckBoxesB();

    }

    public void makeCheckBoxesA() {
        RadioGroup rgExistingLutemons = findViewById(R.id.cbLutemonA);
        ArrayList<Lutemon> lutemons = LutemonStorage.getInstance().getLutemons();

        RadioButton rb;
        int j = 0;
        for(Lutemon l : lutemons) {
            rb = new RadioButton(this);
            rb.setText(l.getName() + " (" + l.getColor() + ")");
            rb.setId(j++);
            rgExistingLutemons.addView(rb);
        }
    }

    public void makeCheckBoxesB() {
        RadioGroup rgExistingLutemons = findViewById(R.id.cbLutemonB);
        ArrayList<Lutemon> lutemons = LutemonStorage.getInstance().getLutemons();


        RadioButton rb;
        int j = 0;
        for(Lutemon l : lutemons) {
            rb = new RadioButton(this);
            rb.setText(l.getName() + " (" + l.getColor() + ")");
            rb.setId(j++);
            rgExistingLutemons.addView(rb);
        }
    }

    public void fightLutemon(View view) {
        RadioGroup cbLutemonA = findViewById(R.id.cbLutemonA);
        RadioGroup cbLutemonB = findViewById(R.id.cbLutemonB);

        Lutemon A = LutemonStorage.getInstance().getLutemonById(cbLutemonA.getCheckedRadioButtonId());
        Lutemon B = LutemonStorage.getInstance().getLutemonById(cbLutemonB.getCheckedRadioButtonId());

        while ((A.getNewLife() > 0) && (B.getNewLife() > 0)) {
            A.stats();
            B.stats();
            A.attack();
            B.defense();
            if(B.getNewLife() > 0) {
                B.fightLutemon();
            }
            else if(B.getNewLife() <= 0) {
                B.dies();
                LutemonStorage.getInstance().addDeadLutemon(new DeadLutemon(B.getName(),B.getColor(),B.getAttack(),B.getDefend(),B.getNewLife(),B.getLife(),B.getExperience(),B.getImage()));
                LutemonStorage.getInstance().removeLutemonById(cbLutemonB.getCheckedRadioButtonId());
                A.winnerLutemon();
                break;
            }
            B.stats();
            A.stats();
            B.attack();
            A.defense();
            if(A.getNewLife() > 0) {
                A.fightLutemon();
            } else if (A.getNewLife() <= 0) {
                A.dies();
                LutemonStorage.getInstance().addDeadLutemon(new DeadLutemon(A.getName(),A.getColor(),A.getAttack(),A.getDefend(),A.getNewLife(),A.getLife(),A.getExperience(),A.getImage()));
                LutemonStorage.getInstance().removeLutemonById(cbLutemonA.getCheckedRadioButtonId());
                B.winnerLutemon();
                break;
            }
        }
    }
}