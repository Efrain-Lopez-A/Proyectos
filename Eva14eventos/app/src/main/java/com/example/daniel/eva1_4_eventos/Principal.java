package com.example.daniel.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Principal extends AppCompatActivity implements View.OnClickListener {//Creamos un listener
    TextView txtMen;//este obejeto se vincula
    Button btnInt;
    Button btnAno;
    Button btnXclase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Vinculas el evento
        txtMen = findViewById(R.id.txtMen);

        btnInt = findViewById(R.id.btnInt);
        btnInt.setOnClickListener(this);//asignamos el listener
        btnAno = findViewById(R.id.btnAno);
        btnXclase = findViewById(R.id.btnXclase);
        //Usamos el objeto
        txtMen.setText("Hola mundo Perros");
        //CREAR el evento
        final Context cntApp = getApplicationContext();
        btnAno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cntApp,"Hola por clase anonima",Toast.LENGTH_LONG).show();
            }
        });
        ClickListener elCLick = new ClickListener();
        btnXclase.setOnClickListener(elCLick);


    }
    public void ELClick(View v){
        Toast.makeText(this,"Hola por XML",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Hola por interfaz",Toast.LENGTH_LONG).show();
    }
}