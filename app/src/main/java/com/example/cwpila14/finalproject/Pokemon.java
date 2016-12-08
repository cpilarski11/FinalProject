package com.example.cwpila14.finalproject;

/**
 * Created by cwpila14 on 12/1/2016.
 */

public class Pokemon {
    // instance variables
    private String name;
    private int HP;
    private int CP;
    private int lvl;

    // constructor
    public Pokemon(String aName, int anHP, int aCP, int alvl) {
        name = aName;
        HP = anHP;
        CP = aCP;
        lvl = alvl;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getCP() {
        return CP;
    }

    public int getlvl() {
        return lvl;
    }

    // update HP
    public void updateHP(int amount) {
        HP += amount;

        // cap the HP to 0
        if (HP < 0) {
            HP = 0;
        }
    }

    // attack another pokemon
    public void attack(Pokemon target) {
        target.updateHP(-CP);
    }
}

