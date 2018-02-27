package com.example.csgradstudent.collegeconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {



    private EditText Name;
    private EditText Password;
    private Button Login;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText) findViewById(R.id.editText4);
        Password = (EditText) findViewById(R.id.editText5);
        Login = (Button) findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());

            }
        });
    }

    public void validate(String userName, String userPassword){

    if((userName.equals("admin") && (userPassword.equals("1234")))){

        Intent intent = new Intent(Login.this, SecondActivity.class);
        startActivity(intent);
        }

        else{
            Toast.makeText(Login.this, "Incorrect Credentials Please Try Again", Toast.LENGTH_SHORT).show();
        }

    }


}
