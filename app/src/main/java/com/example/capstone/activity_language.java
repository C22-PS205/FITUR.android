package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        ImageView btnMenu = (ImageView) findViewById(R.id.btn_homeOff);
        ImageView btnScan = (ImageView) findViewById(R.id.btn_scanl);
        ImageView btnLangEng = (ImageView) findViewById(R.id.langengoff);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(activity_language.this, MainMenuBahasa.class);
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

        btnLangEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLangE = new Intent(activity_language.this, activity_langenglish.class);
                startActivity(intLangE);
            }
        });
    }

}