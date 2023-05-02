package com.example.harkkatyo;

import android.widget.TextView;
import java.util.ArrayList;

import java.lang.String;

public class Lutemon {

    private int id;
    public int getId() {
        return id;
    }

    private String name;
    public String getName() {
        return name;
    }
    private String color;
    public String getColor() {
        return color;
    }

    private int attack;
    public int getAttack() {
        return attack;
    }

    private int defend;
    public int getDefend() {
        return defend;
    }

    private int newLife;
    public int getNewLife() {
        return newLife;
    }

    private int life;
    public int getLife() {
        return life;
    }
    private int experience;
    public int getExperience() {
        return experience;
    }

    public int image;
    public int getImage() {
        return image;
    }

    public Lutemon(String name, String color, int attack, int defend, int newLife, int life, int experience, int image) {
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defend = defend;
        this.newLife = newLife;
        this.life = life;
        this.experience = experience;
        this.image = image;

        id = (int)(Math.random() * 100);
    }

    public void trainLutemon(TextView txtLutemonMessage) {
        experience = experience + 1;
        attack = attack + 1;
        txtLutemonMessage.setText(name + ":n kokemus on nyt " + experience + " ja hyökkäyspisteet " + attack);
    }

    public void healLutemon(TextView txtHealLutemonMessage) {
        newLife = life;
        txtHealLutemonMessage.setText(name + ":n elämät on palautettu " + newLife + " / " + life);
    }

    public void fightLutemon() {
        System.out.println(name + "(" + color + ") onnistui välttämään kuoleman.");
    }

    public void stats() {
        System.out.println(name + "(" + color + ") att: " + attack + "; def: " + defend + "; exp: " + experience + "; health: " + newLife + "/" + life);
    }

    int attackForce;
    public void attack() {
        System.out.println(name + "(" + color + ") hyökkää.");
        attackForce = attack;
    }

    public void defense() {
        newLife = newLife + defend - attackForce;
    }

    public void dies() {
        System.out.println(name + "(" + color + ")" + " kuoli. :(");
        System.out.println("Taistelu on ohi.");
    }

    public void winnerLutemon() {
        experience = experience + 1;
        attack = attack + 1;
    }
}
