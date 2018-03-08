package com.example.a2016951790.exerc01;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        final EditText texto = findViewById(R.id.textodigitado);
        Button submit = findViewById(R.id.clickme);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = texto.getText().toString();
                Context contexto = getApplicationContext();
                int duracao = Toast.LENGTH_SHORT;
                if(!text.equals("")){
                    Toast toast = Toast.makeText(contexto, text, duracao);
                    toast.show();
                }
                else{
                    Log.i("Escreva algo", "Nada foi digitado");
                    Toast ttoast = Toast.makeText(contexto, "Nada foi digitado", duracao);
                    ttoast.show();
                }
            }
        });

    }

}