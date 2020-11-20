package com.example.android.bekasitourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonWisataSatu, buttonWisataDua, buttonWisataTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWisataSatu = findViewById(R.id.button_wisata_satu);
        buttonWisataDua = findViewById(R.id.button_wisata_dua);
        buttonWisataTiga = findViewById(R.id.button_wisata_tiga);

        buttonWisataSatu.setOnClickListener(view -> {
            Intent goToWisataSatu = new Intent(MainActivity.this, WisataSatuActivity.class);
            startActivity(goToWisataSatu);
        });

        buttonWisataDua.setOnClickListener(view -> {
            Intent goToWisataDua = new Intent(MainActivity.this, WisataDuaActivity.class);
            startActivity(goToWisataDua);
        });

        buttonWisataTiga.setOnClickListener(view -> {
            Intent goToWisataTiga = new Intent(MainActivity.this, WisataTigaActivity.class);
            startActivity(goToWisataTiga);
        });
    }
}