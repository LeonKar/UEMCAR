package com.example.a21201130.uemcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        etUser.setText("login");
        etPasswd.setText("passwd");
        btnEntrar.setText("btnEntrar");
        btnRegistrar.setText("btnRegistrar");
    }

    public void entrar(View view){
        Intent i = new Intent(this, MainActivity.class);
    }

    public void registrar(View view){
        Intent i = new Intent(this, SignInActivity.class);
    }
}
