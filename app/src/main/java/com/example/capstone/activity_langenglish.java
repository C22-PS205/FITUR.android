package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_langenglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langenglish);

        ImageView btnMenu = (ImageView) findViewById(R.id.btn_homeOff);
        ImageView btnScan = (ImageView) findViewById(R.id.btn_scanl);
        ImageView btnLangInd = (ImageView) findViewById(R.id.langind);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(activity_langenglish.this, MainMenu.class);
                startActivity(intScan);
            }
        });

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(activity_langenglish.this, ScanMenu.class);
                startActivity(intScan);
            }
        });

        btnLangInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLangI = new Intent(activity_langenglish.this, activity_language.class);
                startActivity(intLangI);
            }
        });
    }

}