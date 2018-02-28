package e.joogabriel.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (TextView) findViewById(R.id.editText);
    }

    public void showToast(View view){
        if(editText.getText().length() != 0)
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this, "Erro: digite algo", Toast.LENGTH_SHORT).show();
    }
}
