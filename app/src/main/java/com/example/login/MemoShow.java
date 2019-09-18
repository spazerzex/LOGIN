package com.example.login;


import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MemoShow extends AppCompatActivity {
    TextView text;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_show);

        text = (TextView)findViewById(R.id.text);
        text2 = (TextView)findViewById(R.id.text2);


        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        String str2 = intent.getStringExtra("message2");
        text.setText(str);
        text2.setText(str2);



    }
}