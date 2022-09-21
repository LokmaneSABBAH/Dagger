package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Farm {
    private static final String TAG = "Farm";
    @Inject
    public Farm() {
        Log.d(TAG, "lokmane Farm: ");
    }

    public String getBeans(){
        return "beans";
    }
}
