package com.example.smarthome20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRgb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgb);
    }

    public void nulla(View view) {
    }

    public void homebase(View view) {
        Intent intent = new Intent(ActivityRgb.this , MainActivity2.class);
        startActivity(intent);
    }

    public void zvonok(View view) {
        Intent intent = new Intent(ActivityRgb.this , home3.class);
        startActivity(intent);
    }

    public void bedrom(View view) {
        Intent intent = new Intent(ActivityRgb.this , home4.class);
        startActivity(intent);
    }
}