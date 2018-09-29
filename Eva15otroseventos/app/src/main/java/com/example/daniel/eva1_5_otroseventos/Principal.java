package com.example.daniel.eva1_5_otroseventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener {

    RadioGroup Rgb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Rgb = findViewById(R.id.Rgb);
        Rgb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String Mensaje = "";
        switch (i) {
            case R.id.RbTacos:
                Mensaje = "Tacos";
                break;
            case R.id.RbPizza:
                Mensaje = "Pizza";
                break;
            case R.id.RbBu:
                Mensaje = "Buñuelos";
                break;
            case R.id.RbMole:
                Mensaje = "Mole";
                break;
            case R.id.RbMon:
                Mensaje = "Montados";
                break;
        }
        Toast.makeText(this, Mensaje, Toast.LENGTH_LONG).show();
    }
}
