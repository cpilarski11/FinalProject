package com.example.cwpila14.finalproject;

/**
 * Created by cwpila14 on 12/1/2016.
 */

public class Charmander extends Pokemon {
    // instance variable
    private int scratch;
    private int tackle;
    private int flamethrower;
    private int ember;

    // constructor
    public Charmander(String aName, int anHP,
                   int aCP, int alvl, int aScratch, int aTackle, int aFlamethrower, int aEmber ) {
        super(aName, anHP, aCP, alvl);
        scratch = aScratch;
        tackle = aTackle;
        flamethrower = aFlamethrower;
        ember = aEmber;
    }

    // thunder shock attack
    public void scratch(Pokemon target) {
        // do the regular attack first
        super.attack(target);
        // apply the shock damage
        target.updateHP(-scratch);
    }
}
