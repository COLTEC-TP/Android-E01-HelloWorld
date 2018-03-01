package ibryans.github.io.hellodroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        final TextView Hello = findViewById(R.id.hello_text);
        final EditText texto = findViewById(R.id.enter_text);
        Button button = findViewById(R.id.button_atualize);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texto.getText().toString().equals(""))
                    Log.i("[Erro do usuário]", "Nada foi digitado!");
                else Toast.makeText(HelloActivity.this, texto.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
