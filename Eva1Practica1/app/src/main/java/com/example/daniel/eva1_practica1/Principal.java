package com.example.daniel.eva1_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnClickListener{
    TextView txtPL;
    EditText EdNum;
    RadioGroup RGroup;
    RadioButton RbtnA, RbtnC, RbtnE;
    Button btntotal;
    CheckBox checkA, checkC;
    int Pres=0;
    String tx,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtPL= findViewById(R.id.txtPL);
        EdNum=findViewById(R.id.EdNum);
        RbtnA=findViewById(R.id.RbtnA);
        RbtnC=findViewById(R.id.RbtnC);
        RbtnE=findViewById(R.id.RbtnE);
        RGroup=findViewById(R.id.RGroup);
        btntotal=findViewById(R.id.btnTotal);
        checkA=findViewById(R.id.checkA);
        checkC=findViewById(R.id.checkC);
        RGroup.setOnCheckedChangeListener(this);
        checkA.setOnClickListener(this);
        checkC.setOnClickListener(this);
        btntotal.setOnClickListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
                case R.id.RbtnA:
                    tx= "Americano";
                    Pres = 20;
                    break;
                case R.id.RbtnC:
                    tx="Capuchino";
                    Pres =48;
                    break;
                case R.id.RbtnE:
                    tx="Expreso";
                    Pres = 30;
                    break;
            }


                txtPL.setText(tx);
}

    @Override
    public void onClick(View v) {
        String Op = tx + "";
        int n= Integer.parseInt(EdNum.getText().toString());
        int ext = 0;

        if (checkA.isChecked() == true) {
            Op += " ,Azucar";
            ext+= +1;
        }
        if (checkC.isChecked() == true) {
            Op += " ,Crema";
            ext+= +1;

        }
        txtPL.setText(Op);

        if (v.getId() == R.id.btnTotal) {

            ext=((ext+Pres)*n);
            String Suma = String.valueOf(ext);
            Toast.makeText(getApplicationContext(),Suma,Toast.LENGTH_LONG).show();
        }
    }


}
