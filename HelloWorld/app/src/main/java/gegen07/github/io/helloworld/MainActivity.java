package gegen07.github.io.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText message = findViewById(R.id.message);
        final Button display_button = findViewById(R.id.display_button);

        display_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message_caught = message.getText().toString();
                if (!TextUtils.isEmpty(message_caught) || !message_caught.equals("")) {
                    Toast.makeText(MainActivity.this,
                            message_caught,
                            Toast.LENGTH_SHORT)
                            .show();
                } else Toast.makeText(MainActivity.this,
                        "Escreva uma mensagem",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });
        
    }
}
