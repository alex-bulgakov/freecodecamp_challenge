package com.example.freecodecamp_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtEmail;
    private EditText edtPwd;
    private EditText edtRetrPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.txtName);
        edtName = findViewById(R.id.txtEmail);
        edtName = findViewById(R.id.txtPassword);
        edtName = findViewById(R.id.txtRePassword);


    }
}