package com.example.days_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_awal);
    }

    public void clickDaftar(View view) {
        Intent i = new Intent(this, tampilan_awal.class);
        startActivity(i);
    }

    public void clickMasuk(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}
