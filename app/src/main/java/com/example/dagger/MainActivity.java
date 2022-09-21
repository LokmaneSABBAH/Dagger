package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee, coffee2;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication)getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent = component.getCoffeeComponentBuilder().milk(4).sugar(5).build();

        coffeeComponent.inject(this);


        //coffee.connectElectrecety();
        Log.d(TAG, "lokmane onCreate: "+coffee.getCoffeeCap()+
                        "\ncoffee 1 "+coffee+
                        "\ncoffee 2 "+coffee2+
                        "\nRiver for coffee 1 "+coffee.river+
                        "\nRiver for coffee 2 "+coffee2.river
                );

        // constructor injection field injection method injection
        
    }
}