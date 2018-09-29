package com.example.daniel.eva1_7_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgMos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgMos = findViewById(R.id.imgMos);
        imgMos.setImageResource(R.drawable.tupudes);
    }
}
