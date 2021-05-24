package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = this.findViewById(R.id.button);
        name = this.findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Olá, " + name.getText().toString() + "!", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 200);
                t.show();
            }
        });
    }
}