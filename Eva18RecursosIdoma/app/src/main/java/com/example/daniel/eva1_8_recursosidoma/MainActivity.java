package com.example.daniel.eva1_8_recursosidoma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup Rgb;
    TextView   txtNombre,txtApellido,txtEdad;
    EditText   edNombre,edApellido,edEdad;
    RadioButton RbEs,RbIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rgb = findViewById(R.id.Rgb);
        Rgb.setOnCheckedChangeListener(this);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        edNombre = findViewById(R.id.edNombre);
        edApellido = findViewById(R.id.edApellido);
        edEdad = findViewById(R.id.edEdad);
        RbEs = findViewById(R.id.RbEs);
        RbIn = findViewById(R.id.RbIn);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        if(i != R.id.RbEs){
            RbEs.setText(R.string.Respa_In);
            RbIn.setText(R.string.Ringles_In);
            txtNombre.setText(R.string.tvnombre_Es);
            edNombre.setHint(R.string.etnombre_In);
        }
        else
        {
            RbEs.setText(R.string.Respa_Es);
            RbIn.setText(R.string.Ringles_Es);
            txtNombre.setText(R.string.tvnombre_Es);
            edNombre.setHint(R.string.etnombre_Es);
        }
    }
}
