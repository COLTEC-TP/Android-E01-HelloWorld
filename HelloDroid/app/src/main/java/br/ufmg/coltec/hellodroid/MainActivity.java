package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "App inicializado");

        txtHelloWorld = findViewById(R.id.txt_hello_world);

        Button btnHelloWorld = findViewById(R.id.btn_hello_world);

        btnHelloWorld.setOnClickListener(view -> {
            if (txtHelloWorld.getText().toString().equals("")){
                Log.e("MainActivity", "Campo vazio");
                return;
            }
            displayToast(findViewById(R.id.txt_hello_world));
        });

    }

    public void displayToast(View v) {
        Toast.makeText(MainActivity.this, "Olá " + txtHelloWorld.getText(), Toast.LENGTH_LONG).show();
    }

}