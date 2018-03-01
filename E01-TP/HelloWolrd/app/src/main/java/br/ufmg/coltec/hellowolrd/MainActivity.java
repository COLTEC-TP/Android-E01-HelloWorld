package br.ufmg.coltec.hellowolrd;

import android.text.TextUtils;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String LOG_TAG=MainActivity.class.getSimpleName();
    EditText mEditUsername;
    EditText mEditPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditUsername = findViewById(R.id.etUsername);
        mEditPassword = findViewById(R.id.etPassword);
    }

    public void onDisplay(android.view.View view) {
        String mensage = mEditUsername.getText().toString() + mEditPassword.getText().toString();


        if (TextUtils.isEmpty(mEditUsername.getText().toString()) || TextUtils.isEmpty(mEditPassword.getText().toString())) {
            Toast.makeText(this, "Campo vazio", Toast.LENGTH_SHORT).show();
            Log.d(LOG_TAG, "Registro do log");
        }

        else{
            Toast.makeText(MainActivity.this, mensage, Toast.LENGTH_LONG).show();
        }
    }
}