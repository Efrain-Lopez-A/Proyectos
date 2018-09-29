package com.example.daniel.eva1_11_otraslistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView listTitulo;
    TextView txtMuestra;
    final String[] sTitulos = {"Los juegos del hambre","el principito","El horno de hitler","Un dia mas"};
    final String[] sMuestras = {"sdfasdffffffffffffffffaaaaasssssssssssssssssssssss ",
            "asdfsadfasdfasdfsadfsadfasdfasdfasdfsadf ", "sdfasdfasdfasdfasdfasdfasdf",
            "casdfasdfkajsdfhjasudfshdfkjadnadufkghkjdnadhlgadf.ughadfughaosdfh.asduf "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        listTitulo = findViewById(R.id.listTitulo);
        txtMuestra = findViewById(R.id.txtMuestra);
        listTitulo.setOnItemClickListener(this);
        listTitulo.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sTitulos));

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtMuestra.setText(sMuestras[i]);
    }
}
