package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        ImageView btnMenu = (ImageView) findViewById(R.id.btn_homeOff);
        ImageView btnScan = (ImageView) findViewById(R.id.btn_scanl);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(activity_language.this, MainMenu.class);
                startActivity(intScan);
            }
        });

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(activity_language.this, ScanMenu.class);
                startActivity(intScan);
            }
        });
    }

}