package br.ufmg.coltec.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Exercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        final EditText textobonito = findViewById(R.id.textoprincipal);
        Button btn_update = findViewById(R.id.btn_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(textobonito.getText().toString().equals("")){
                    Log.e(Exercicio1.class.getName(), "Vocẽ não digitou nada no campo!");
                }
                else{
                    Toast.makeText(Exercicio1.this,
                            textobonito.getText(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
