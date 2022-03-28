package com.example.days_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class aktivitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitas);
    }

    public void clickArrow(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

}

