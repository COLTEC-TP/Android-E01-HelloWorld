package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MainActivity.class.getName(), "Aplicativo inicializado");

        Button btnSendName = this.findViewById(R.id.btn_send_name);
        EditText name = this.findViewById(R.id.editText);

        btnSendName.setOnClickListener(view -> {
            if(name.getText().toString().length() == 0){
                Log.e(MainActivity.class.getName(), "Campo vazio");
            }
            Toast t = Toast.makeText(MainActivity.this, "Olá, " + name.getText().toString() + "!", Toast.LENGTH_SHORT);
            t.setGravity(Gravity.TOP, 0, 200);
            t.show();
        });
    }
}