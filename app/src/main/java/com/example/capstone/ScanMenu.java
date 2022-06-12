package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ScanMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu);

        ImageView btnMenu = (ImageView) findViewById(R.id.btn_menuscan);
        ImageView btnIdentity = (ImageView) findViewById(R.id.btn_capture);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intMenu = new Intent(ScanMenu.this, MainMenu.class);
                startActivity(intMenu);
            }
        });

        btnIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intMenu = new Intent(ScanMenu.this, Identity.class);
                startActivity(intMenu);
            }
        });

    }
}