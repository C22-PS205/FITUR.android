package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TypesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_menu);

        ImageView btn1 = (ImageView) findViewById(R.id.btn_types1);
        ImageView btn2 = (ImageView) findViewById(R.id.btn_types2);
        ImageView btn3 = (ImageView) findViewById(R.id.btn_types3);
        ImageView btn4 = (ImageView) findViewById(R.id.btn_types4);
        ImageView btn5 = (ImageView) findViewById(R.id.btn_types5);
        ImageView btn6 = (ImageView) findViewById(R.id.btn_types6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(TypesMenu.this, Types1.class);
                startActivity(int1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(TypesMenu.this, Types2.class);
                startActivity(int2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(TypesMenu.this, Types3.class);
                startActivity(int3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(TypesMenu.this, Types4.class);
                startActivity(int4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(TypesMenu.this, Types5.class);
                startActivity(int5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(TypesMenu.this, Types6.class);
                startActivity(int6);
            }
        });

    }
}