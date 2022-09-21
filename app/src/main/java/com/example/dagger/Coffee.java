package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {

    private static final String TAG = "Coffee";

    // 2 dependency

    public River river;
    @Inject
    public Farm farm;

    int suger;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int suger, @Milk int milk) {
        this.river = river;
        this.suger = suger;
        this.milk = milk;
    }

    public String getCoffeeCap(){
        return river.getWater()+" + "+farm.getBeans()+" suger : "+suger+" milk : "+milk;
    }

    @Inject
    public void connectElectrecety(){
        Log.d(TAG, "lokmane connectElectrecety: connecting...");
    }
}
