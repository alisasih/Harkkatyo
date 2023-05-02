package com.example.harkkatyo;

public class DeadLutemon {

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

    public DeadLutemon(String name, String color, int attack, int defend, int newLife, int life, int experience, int image) {
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defend = defend;
        this.newLife = newLife;
        this.life = life;
        this.experience = experience;
        this.image = image;
    }
}
