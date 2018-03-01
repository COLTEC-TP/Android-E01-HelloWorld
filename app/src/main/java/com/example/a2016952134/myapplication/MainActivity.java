package com.example.a2016952134.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtlogin = findViewById(R.id.txt_login);
        Button btnlogin = findViewById(R.id.txt_enter);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtlogin.getText().length()>0) {
                    Toast.makeText(MainActivity.this, txtlogin.getText(), Toast.LENGTH_SHORT).show();
                }else{
                    int i = Log.d(TAG, "onClick: ERRO");
                }
            }
        });

    }
}
