package com.fz.shoppyapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fz.shoppyapp.R;

public class LoginActivity extends AppCompatActivity {
    ImageButton login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (ImageButton) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().toUpperCase().equals("TEST1")) {
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(),"Salah Password",Toast.LENGTH_SHORT).show();
                }
            }

            private void login_sukses() {
            String user_login = username.getText().toString();
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            //kirimkan username ke tampilan utama
            i.putExtra("USERNAME", user_login);
            startActivity(i);
            }
        });
    }
}
