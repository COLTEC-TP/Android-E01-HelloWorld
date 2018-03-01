package br.ufmg.coltec.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    EditText campo_texto;
    Button botao;
    private static final String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo_texto = findViewById(R.id.campo);
        botao = findViewById(R.id.botao);

        botao.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(campo_texto.getText().length() < 1) {
                            Toast.makeText(MainActivity.this, "Texto invalido", Toast.LENGTH_SHORT).show();
                            Log.i(TAG, "App inicializado!!");
                        }
                        else
                            Toast.makeText(MainActivity.this,campo_texto.getText(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
