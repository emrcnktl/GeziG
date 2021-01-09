package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarihArea extends AppCompatActivity {
    private Button tarihListemeEkle1;
    private Button tarihListemeEkle2;
    private Button tarihListemeEkle3;
    private Button tarihListemeEkle4;
    private Button tarihListemeEkle5;
    private Button tarihListemeEkle6;
    private Button tarihListemeEkle7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarih_area);

        tarihListemeEkle1 = findViewById(R.id.tarihListemeEkle1);
        tarihListemeEkle2 = findViewById(R.id.tarihListemeEkle2);
        tarihListemeEkle3 = findViewById(R.id.tarihListemeEkle3);
        tarihListemeEkle4 = findViewById(R.id.tarihListemeEkle4);
        tarihListemeEkle5 = findViewById(R.id.tarihListemeEkle5);
        tarihListemeEkle6 = findViewById(R.id.tarihListemeEkle6);
        tarihListemeEkle7 = findViewById(R.id.tarihListemeEkle7);


        tarihListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Topkapı Sarayına git \n";
                tarihListemeEkle1.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Kapalı Çarşıya git \n";
                tarihListemeEkle2.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Yerebatan Sarnıcına git \n";
                tarihListemeEkle3.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Galata Kulesine git \n";
                tarihListemeEkle4.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Rumeli Hisarına git \n";
                tarihListemeEkle5.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Dolmabahçe Sarayına git \n";
                tarihListemeEkle6.setVisibility(View.GONE);
            }
        });

        tarihListemeEkle7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Kız Kulesine git \n";
                tarihListemeEkle7.setVisibility(View.GONE);
            }
        });


    }
}