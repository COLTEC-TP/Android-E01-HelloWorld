package com.example.a2016951820.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texto = findViewById(R.id.txt);
        Button btnEn = findViewById(R.id.btn_en);

        btnEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().toString().equals("")){
                    Log.i(TAG, "Campo de texto em branco!");
                }else {

                    Toast.makeText(MainActivity.this,
                            texto.getText(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
