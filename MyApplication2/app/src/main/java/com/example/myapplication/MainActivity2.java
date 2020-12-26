package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





        final TextView  v = findViewById(R.id.n1);
        final TextView  s = findViewById(R.id.e1);
        final TextView  x = findViewById(R.id.adress1);
        Bundle a = getIntent().getExtras();
        final TextView  p = findViewById(R.id.p1);
        v.setText( a.getString ("user"));
        p.setText(a.getString("phone "));
        s.setText(a.getString ("email"));
        x.setText(a.getString ("adress"));

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("phone"));
                startActivity(callIntent);




            }
        });




        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, (Parcelable) s);
                startActivity(Intent.createChooser(email,"Send Email"));
                email.setType("text/plain");
startActivity(Intent.createChooser(email,"send mail"));

            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri gmmIntentUri = Uri.parse("goole.streetview:cbll=");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);


            }
        });



    }
}