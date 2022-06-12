package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Identity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);

        ImageView backIdentity = (ImageView) findViewById(R.id.btn_backidentity) ;
        ImageView btnSeeDetails = (ImageView) findViewById(R.id.btn_seedetails) ;

        backIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intBack = new Intent(Identity.this, ScanMenu.class);
                startActivity(intBack);
            }
        });

        btnSeeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intDetails = new Intent(Identity.this, Types3.class);
                startActivity(intDetails);
            }
        });
    }
}