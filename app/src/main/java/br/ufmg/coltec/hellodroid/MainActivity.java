package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MainActivity.class.getName(), "App inicializado");

        Button botao = this.findViewById(R.id.botao);
        EditText nome = this.findViewById(R.id.nome);

        botao.setOnClickListener(view -> {
            if(nome.getText().toString().length() == 0){
                Log.e(MainActivity.class.getName(), "Campo vazio");
            }
            Toast toast = Toast.makeText(MainActivity.this, "Olá, " + nome.getText().toString(), Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        });
    }
}