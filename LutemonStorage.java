package com.example.harkkatyo;

import java.util.ArrayList;

public class LutemonStorage {
    private ArrayList<Lutemon> lutemons = new ArrayList<>();
    private ArrayList<DeadLutemon> deadLutemons = new ArrayList<>();
    private ArrayList<String> texts = new ArrayList<>();
    private static LutemonStorage lutemonstorage = null;


    private LutemonStorage() {
    }

    public static LutemonStorage getInstance() {
        if (lutemonstorage == null) {
            lutemonstorage = new LutemonStorage();
        }
        return lutemonstorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return lutemons;
    }

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return lutemons.get(id);
    }

    public Lutemon removeLutemonById(int id) {
        return lutemons.remove(id);
    }

    public void addDeadLutemon(DeadLutemon deadLutemon) {
        deadLutemons.add(deadLutemon);
    }

    public ArrayList<DeadLutemon> getDeadLutemons() {
        return deadLutemons;
    }

    public void addFight(String fight) {
        texts.add(fight);
    }

    public ArrayList<String> getFight() {
        return texts;
    }
}