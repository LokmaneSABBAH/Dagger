package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = DaggerCoffeeComponent.builder().sugar(2).milk(5).build();
        component.inject(this);
        //coffee.connectElectrecety();
        Log.d(TAG, "lokmane onCreate: "+coffee.getCoffeeCap());

        // constructor injection field injection method injection
        
    }
}