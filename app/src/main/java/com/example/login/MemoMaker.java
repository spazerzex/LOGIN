package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MemoMaker extends AppCompatActivity {


    EditText textBox;
    EditText textBox2;
    Button passButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_maker);


        textBox = (EditText)findViewById(R.id.memotitle);
        textBox2 = (EditText)findViewById(R.id.memocontent);
        passButton = (Button)findViewById(R.id.addnote);
    }







        public void memo(View v) {
            String str = textBox.getText().toString();
            String str2 = textBox2.getText().toString();


            Intent intent = new Intent(getApplicationContext(), MemoShow.class);
            intent.putExtra("message", str);
            intent.putExtra("message2", str2);
            startActivity(intent);



    }




}
