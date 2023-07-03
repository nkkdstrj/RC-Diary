package com.rcdiary.rogationistcollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edStudNum, edPassword;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edStudNum = findViewById(R.id.editTextStudentNumber);
        edPassword = findViewById(R.id.editTextLoginPassword);
        btn = findViewById(R.id.LoginButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String student = edStudNum.getText().toString();
                String password = edPassword.getText().toString();
                if(student.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(), "Please Fill all details.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
            }
        });
    }
}