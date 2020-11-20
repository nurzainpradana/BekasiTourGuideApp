package com.example.android.bekasitourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WisataSatuActivity extends AppCompatActivity {
    Button buttonKembali, buttonMenujuLokasi;
    String googleMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String lokasiKordinat = "-6.2592573,107.0524311"; // koordinat rumah saya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_satu);

        buttonKembali = findViewById(R.id.button_kehalaman_utama);


        buttonMenujuLokasi = findViewById(R.id.button_menuju_lokasi);

        buttonKembali.setOnClickListener(view -> onBackPressed());

        buttonMenujuLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + lokasiKordinat);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(googleMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataSatuActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}