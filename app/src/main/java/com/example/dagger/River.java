package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";
    // @Inject
    //class for view only
    public River() {
        Log.d(TAG, "lokmane River: ");
    }

    public String getWater(){
        return "water";
    }
}
