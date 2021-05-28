package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private InputMethodManager inputMethodManager;
    private TextView txt;
    private EditText input;
    private Button btnSend;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        inputMethodManager = (InputMethodManager) getSystemService(context.INPUT_METHOD_SERVICE);

        txt =  findViewById(R.id.txt_hello_world);
        input = findViewById(R.id.txt_input);
        btnSend = findViewById(R.id.btn_send);

        btnSendOnClick();

        Log.d("initialized", "App inicializado");
    }

    private void btnSendOnClick(){
        btnSend.setOnClickListener(view -> {
            if(input.getText().toString().equals("")){
                Log.e("empty", "Campo vazio");
            }else{
                inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                toast = Toast.makeText(context, input.getText().toString(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}