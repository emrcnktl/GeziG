package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sporArea extends AppCompatActivity {
    private Button sporListemeEkle1;
    private Button sporListemeEkle2;
    private Button sporListemeEkle3;
    private Button sporListemeEkle4;
    private Button sporListemeEkle5;
    private Button sporListemeEkle6;
    private Button sporListemeEkle7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spor_area);

        sporListemeEkle1 = findViewById(R.id.sporListemeEkle1);
        sporListemeEkle2 = findViewById(R.id.sporListemeEkle2);
        sporListemeEkle3 = findViewById(R.id.sporListemeEkle3);
        sporListemeEkle4 = findViewById(R.id.sporListemeEkle4);
        sporListemeEkle5 = findViewById(R.id.sporListemeEkle5);
        sporListemeEkle6 = findViewById(R.id.sporListemeEkle6);
        sporListemeEkle7 = findViewById(R.id.sporListemeEkle7);


        sporListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Conrad Tenis Kulübüne git \n";
                sporListemeEkle1.setVisibility(View.GONE);
            }
        });


        sporListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Şükrü Saraçoğlu Stadyumuna git \n";
                sporListemeEkle2.setVisibility(View.GONE);
            }
        });

        sporListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Alkuzu Binicilik Okuluna git \n";
                sporListemeEkle3.setVisibility(View.GONE);
            }
        });

        sporListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Atatürk Olimpiyat Stadyumuna git \n";
                sporListemeEkle4.setVisibility(View.GONE);
            }
        });

        sporListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"İTÜ Olimpik Yüzme Havuzuna git \n";
                sporListemeEkle5.setVisibility(View.GONE);
            }
        });

        sporListemeEkle6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Türk Telekom Stadyumuna git \n";
                sporListemeEkle6.setVisibility(View.GONE);
            }
        });

        sporListemeEkle7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Vodafone Parka git \n";
                sporListemeEkle7.setVisibility(View.GONE);
            }
        });

    }
}