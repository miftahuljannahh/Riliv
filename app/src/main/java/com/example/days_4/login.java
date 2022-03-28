package com.example.days_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void clickGoogle(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void clickEmail(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}

