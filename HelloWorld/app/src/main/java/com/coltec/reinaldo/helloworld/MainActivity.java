package com.coltec.reinaldo.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText campoTexto = findViewById(R.id.campo);
        Button theBotao = findViewById(R.id.botao);

        theBotao.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(campoTexto.getText().length()>0) {
                            Toast.makeText(MainActivity.this, campoTexto.getText(), Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Log.i(String.valueOf(campoTexto), "onClick: error");
                        }
                    }
                }
        );
    }
}
