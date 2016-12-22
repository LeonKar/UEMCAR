package com.example.a21201130.uemcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUser, etPasswd;
    Button btnEntrar, btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser = (EditText) findViewById(R.id.etUser);
        etPasswd = (EditText) findViewById(R.id.etPasswd);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
    }

    public void entrar(View view){
        if (etUser.getText().length() == 0) {
            Toast.makeText(LoginActivity.this, R.string.toastlogin, Toast.LENGTH_SHORT).show();
        }else if(etPasswd.getText().length() == 0) {
            Toast.makeText(LoginActivity.this, R.string.toastpasswd, Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }

    public void registrar(View view){
            Intent i = new Intent(this, SignInActivity.class);
            startActivity(i);
    }
}
