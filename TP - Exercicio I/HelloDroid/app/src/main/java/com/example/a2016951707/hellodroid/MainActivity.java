package com.example.a2016951707.hellodroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texto1 = findViewById(R.id.editText1);
        Button btntexto1 = findViewById(R.id.button);

        btntexto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (texto1.getText().length() == 0){

                    Toast.makeText(MainActivity.this,"Texto Vazio", Toast.LENGTH_SHORT).show();
                }

                else {

                    Toast.makeText(MainActivity.this, texto1.getText(), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}