package comd.example.a2016951618.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex1 extends AppCompatActivity {

    private static final String TAG = Ex1.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        Button btnenviar = findViewById(R.id.btnenviar);
        final EditText txttexto = findViewById(R.id.txttexto);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if(txttexto.getText().toString().equals("")){
                    Log.i(TAG, "Texto vazio.");
                }
                else {
                    Toast.makeText(Ex1.this, txttexto.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}