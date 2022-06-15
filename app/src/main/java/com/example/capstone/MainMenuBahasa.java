package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuBahasa extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_bahasa);

        ImageView btnScan = (ImageView) findViewById(R.id.btn_scan);
        ImageView btnChatBot = (ImageView) findViewById(R.id.btn_chatBot);
        ImageView btnTypes = (ImageView) findViewById(R.id.btn_types);
        ImageView btnLanguage = (ImageView) findViewById(R.id.btn_languageOff) ;

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intScan = new Intent(MainMenuBahasa.this, ScanMenu.class);
                startActivity(intScan);
            }
        });

        btnChatBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intChat = new Intent(MainMenuBahasa.this, ChatbotMenu.class);
                startActivity(intChat);
            }
        });

        btnTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intTypes = new Intent(MainMenuBahasa.this, TypesBahasa.class);
                startActivity(intTypes);
            }
        });

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLang = new Intent(MainMenuBahasa.this, activity_language.class);
                startActivity(intLang);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}