package br.com.etecia.cafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    MuffinFragment muffinFragment = new MuffinFragment();
    CoffeFragment coffeFragment = new CoffeFragment();
    TeaFragment teaFragment = new TeaFragment();
    DonutFragment donutFragment = new DonutFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.)
    }
}