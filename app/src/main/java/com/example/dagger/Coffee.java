package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    // 2 dependency

    public River river;
    @Inject
    public Farm farm;

    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    public String getCoffeeCap(){
        return river.getWater()+" + "+farm.getBeans();
    }

    @Inject
    public void connectElectrecety(){
        Log.d(TAG, "lokmane connectElectrecety: connecting...");
    }
}
