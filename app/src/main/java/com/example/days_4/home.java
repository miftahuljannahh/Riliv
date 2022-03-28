package com.example.days_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void clickArrowright(View view) {
        Intent i = new Intent(this, aktivitas.class);
        startActivity(i);
    }

    public void clickHome(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickMindful(View view) {
        Intent i = new Intent(this, mindful.class);
        startActivity(i);
    }

    public void clickKonseling(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickJournal(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickJourney(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}

