package dener.hellodroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Button botao = findViewById(R.id.enviar);
        final EditText msg = findViewById(R.id.mensagem);
        final String imprimir = msg.getText().toString();
        final String TAG = "HelloDroid";

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imprimir.equals("")) {
                    Log.e(TAG, "Campo Vazio");
                    return;
                }
                Toast.makeText(HelloActivity.this, imprimir, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
