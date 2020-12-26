package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final  EditText a = findViewById(R.id.adress);
        final EditText e = findViewById(R.id.email);
        final EditText x = findViewById(R.id.name);
        final EditText p = findViewById(R.id.phone);
       Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                String name = x.getText().toString();
                String phone= p.getText().toString();
                String email= e.getText().toString();
                String adress= a.getText().toString();

                i.putExtra("user",name);
                i.putExtra("phone",phone);
                i.putExtra("email",email);
                i.putExtra("adress",adress);
                startActivity(i);
            }
        });




    }
}