package com.example.app_ods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnODS11 = findViewById(R.id.btnODS11);
        btnODS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods11.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS12 = findViewById(R.id.btnODS12);
        btnODS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods12.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS13 = findViewById(R.id.btnODS13);
        btnODS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods13.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS14 = findViewById(R.id.btnODS14);
        btnODS14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods14.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS15 = findViewById(R.id.btnODS15);
        btnODS15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods15.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods6.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS7 = findViewById(R.id.btnODS7);
        btnODS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods7.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS8 = findViewById(R.id.btnODS8);
        btnODS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods8.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS9 = findViewById(R.id.btnODS9);
        btnODS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods9.class);
                startActivity(telaLin);
            }
        });

        ImageButton btnODS10 = findViewById(R.id.btnODS10);
        btnODS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin = new Intent(getApplicationContext(),ods10.class);
                startActivity(telaLin);
            }
        });

        Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }
}