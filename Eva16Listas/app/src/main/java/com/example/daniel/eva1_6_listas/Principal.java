package com.example.daniel.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView lstView;
    TextView txtMostrar;
    final String[] sResta = {"Cesta","Tacos felipe","Montados Jr","Burritos jona",
            "Sushi-Log","Dominos","Carls Junior","Pizzas la Sierra",
            "Tacos lalos","Burger king","lolas Burger","NOSE","Little Cesar Pizza"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstView = findViewById(R.id.lstView);
        txtMostrar = findViewById(R.id.txtMostrar);
        //Necesitamos asignar un adaptador
        //Es un intermediario para el origen de los datos
        lstView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,sResta));
        lstView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtMostrar.setText(sResta[i]);
    }
}
