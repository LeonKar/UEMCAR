package com.example.a21201130.uemcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    EditText etEmail,etUsuario,etPassword;
    Button boton;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        etEmail=(EditText)findViewById(R.id.email);
        etUsuario=(EditText)findViewById(R.id.usuario);
        etPassword=(EditText)findViewById(R.id.password);
        boton=(Button)findViewById(R.id.btnRegistrar);
    }
    public void registrar(View v){
        if(etEmail.getText().toString().equals("") || etUsuario.getText().toString().equals("") || etPassword.getText().toString().equals("")){
            Toast.makeText(this,R.string.vacio,Toast.LENGTH_SHORT).show();
        }else{
            intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
    }
}
