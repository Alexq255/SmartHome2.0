package com.example.smarthome20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void $(View view) {

    }

    public void Rgb(View view) {

    }

    public void zvon(View view) {
    Intent intent = new Intent(MainActivity2.this , home3.class);
    startActivity(intent);
    }

    public void bed(View view) {
        Intent intent = new Intent(MainActivity2.this , home4.class);
        startActivity(intent);
    }

    public void LampAct(View view) {
        Intent intent = new Intent(MainActivity2.this, ActivityRgb.class);
        startActivity(intent);
    }
}