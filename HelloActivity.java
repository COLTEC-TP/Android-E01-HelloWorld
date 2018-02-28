package br.ufmg.coltec.hellodroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        //Instancia do botão//
        final EditText text = findViewById(R.id.text);
        Button btnLogin = findViewById(R.id.btn_login);


            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (text.getText().length()>0) {
                        Toast.makeText(HelloActivity.this, text.getText(), Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Log.i(String.valueOf(text), "onCreate: Error");
                    }

            }
            });
    }
}