package gegen07.github.io.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText message = findViewById(R.id.message);
        final Button displayButton = findViewById(R.id.display_button);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageCaught = message.getText().toString();
                if (!TextUtils.isEmpty(messageCaught) || !messageCaught.equals("")) {
                    Toast.makeText(MainActivity.this,
                            messageCaught,
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Escreva uma mensagem",
                            Toast.LENGTH_SHORT)
                            .show();
                    Log.i(LOG_TAG, "Caixa de texto vazia!");
                }
            }
        });
        
    }
}
