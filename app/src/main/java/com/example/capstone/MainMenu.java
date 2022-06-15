package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageView btnScan = (ImageView) findViewById(R.id.btn_scan);
        ImageView btnChatBot = (ImageView) findViewById(R.id.btn_chatBot);
        ImageView btnTypes = (ImageView) findViewById(R.id.btn_types);
        ImageView btnLanguage = (ImageView) findViewById(R.id.btn_languageOff) ;

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(MainMenu.this, ScanMenu.class);
                startActivity(intScan);
            }
        });

        btnChatBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intChat = new Intent(MainMenu.this, ChatbotMenu.class);
                startActivity(intChat);
            }
        });

        btnTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intTypes = new Intent(MainMenu.this, TypesMenu.class);
                startActivity(intTypes);
            }
        });

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLang = new Intent(MainMenu.this, activity_langenglish.class);
                startActivity(intLang);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}