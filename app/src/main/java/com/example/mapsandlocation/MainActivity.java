package com.example.mapsandlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mapsandlocation.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    Button browseMap;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browseMap = findViewById(R.id.browseMap);
        loginBtn = findViewById(R.id.loginBtn);

        browseMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(n);
            }
        });
    }
}