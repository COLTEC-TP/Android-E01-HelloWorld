package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

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

        Log.d("MainActivity", "App inicializado");

        EditText editText = findViewById(R.id.txt_name);
        Button button = findViewById(R.id.btn_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.length() != 0) {
                    Toast toast = Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    Log.e("MainActivity", "Campo vazio");
                }
            }
        });
    }
}