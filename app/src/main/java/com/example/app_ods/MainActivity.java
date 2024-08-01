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

        ImageButton btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin1 = new Intent(getApplicationContext(),ods1.class);
                startActivity(telaLin1);
            }
        });

        ImageButton btnODS2 = findViewById(R.id.btnODS2);
        btnODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin2 = new Intent(getApplicationContext(),ods2.class);
                startActivity(telaLin2);
            }
        });

        ImageButton btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin3 = new Intent(getApplicationContext(),ods3.class);
                startActivity(telaLin3);
            }
        });

        ImageButton btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin4 = new Intent(getApplicationContext(),ods4.class);
                startActivity(telaLin4);
            }
        });

        ImageButton btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLin5 = new Intent(getApplicationContext(),ods5.class);
                startActivity(telaLin5);
            }
        });

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