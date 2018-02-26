package com.example.riversong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){
        EditText txtAltura = (EditText) findViewById(R.id.altura);
        EditText txtPeso = (EditText) findViewById(R.id.peso);

        if(txtAltura == null || txtPeso == null){
            Log.w("Warn", "Falta um ou mais parâmetros");
        }
        double altura = Double.parseDouble(txtAltura.getText().toString());
        double peso = Double.parseDouble(txtPeso.getText().toString());

        double imc = peso/ altura/100*altura/100;

        if(imc > 32)
            Toast.makeText(this, "Você está acima do peso!!!",Toast.LENGTH_SHORT).show();
        else if(imc < 19 )
            Toast.makeText(this, "Você está abaixo do peso!!!",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Você tem o peso ideal para sua altura!!!", Toast.LENGTH_SHORT).show();
    }
}
