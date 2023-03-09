package com.example.smarthome20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
    }

    public void $$$(View view) {
        Intent intent = new Intent(home4.this , MainActivity2.class);
        startActivity(intent);
    }

    public void rgbimp(View view) {
        Intent intent = new Intent(home4.this , ActivityRgb.class);
        startActivity(intent);
    }

    public void zvonocheg(View view) {
        Intent intent = new Intent(home4.this , home3.class);
        startActivity(intent);
    }

    public void bedroomrap(View view) {
        Intent intent = new Intent(home4.this , home4.class);
        startActivity(intent);
    }
}