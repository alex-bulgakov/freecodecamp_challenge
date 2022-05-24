package com.example.freecodecamp_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtEmail;
    private EditText edtPwd;
    private EditText edtRetrPwd;
    private CheckBox agree;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.txtName);
        edtEmail = findViewById(R.id.txtEmail);
        edtPwd = findViewById(R.id.txtPassword);
        edtRetrPwd = findViewById(R.id.txtRePassword);
        btn_register = findViewById(R.id.btn_register);
        agree = findViewById(R.id.licenseAgree);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (    edtName.getText().toString().equals("") ||
                        edtEmail.getText().toString().equals("") ||
                        edtPwd.getText().toString().equals("") ||
                        edtRetrPwd.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Name/Email/Password/Reenter password", Toast.LENGTH_SHORT).show();
                } else if (!agree.isChecked()) {
                    Toast.makeText(MainActivity.this, "You need to agree with license", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Success registration", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}