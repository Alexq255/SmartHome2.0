package com.example.smarthome20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
    }

    public void $$(View view) {
        Intent intent = new Intent(home3.this , MainActivity2.class);
        startActivity(intent);
    }

    public void Rgblampa(View view) {
        Intent intent = new Intent(home3.this , ActivityRgb.class);
        startActivity(intent);
    }

    public void bedrooom(View view) {
        Intent intent = new Intent(home3.this , home4.class);
        startActivity(intent);
    }
}