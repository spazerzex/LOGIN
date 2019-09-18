package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.etRegistration);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Info.setText("No. of attempts Remaining is 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("antriksh")) && (userPassword.equals("12345")) ){
            Intent intent = new Intent(MainActivity.this, MemoActivity.class);

            startActivity(intent);
        } else {

            counter--;
            Info.setText("No of attempts  " + String.valueOf(counter));
            if (counter == 0) {
                Login.setEnabled(false);
            }


        }



    }

    public void signup(View view) {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);

        startActivity(intent);
    }
}
