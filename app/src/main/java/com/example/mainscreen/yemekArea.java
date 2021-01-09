package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yemekArea extends AppCompatActivity {
    private Button yemekListemeEkle1;
    private Button yemekListemeEkle2;
    private Button yemekListemeEkle3;
    private Button yemekListemeEkle5;
    private Button yemekListemeEkle6;
    private Button yemekListemeEkle7;
    private Button yemekListemeEkle8;
    private Button yemekListemeEkle9;
    private Button yemekListemeEkle10;
    private Button yemekListemeEkle11;
    private Button yemekListemeEkle12;
    private Button yemekListemeEkle13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_area);

        yemekListemeEkle1 = findViewById(R.id.yemekListemeEkle1);
        yemekListemeEkle2 = findViewById(R.id.yemekListemeEkle2);
        yemekListemeEkle3 = findViewById(R.id.yemekListemeEkle3);
        yemekListemeEkle5 = findViewById(R.id.yemekListemeEkle5);
        yemekListemeEkle6 = findViewById(R.id.yemekListemeEkle6);
        yemekListemeEkle7 = findViewById(R.id.yemekListemeEkle7);
        yemekListemeEkle8 = findViewById(R.id.yemekListemeEkle8);
        yemekListemeEkle9 = findViewById(R.id.yemekListemeEkle9);
        yemekListemeEkle10 = findViewById(R.id.yemekListemeEkle10);
        yemekListemeEkle11 = findViewById(R.id.yemekListemeEkle11);
        yemekListemeEkle12 = findViewById(R.id.yemekListemeEkle12);
        yemekListemeEkle13 = findViewById(R.id.yemekListemeEkle13);

        yemekListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Eminönünde Balık Ekmek Ye \n";
                yemekListemeEkle1.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Ortaköyde Kumpir Ye \n";
                yemekListemeEkle2.setVisibility(View.GONE);
            }
        });


        yemekListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Sarıyerde Börek Ye \n";
                yemekListemeEkle3.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Karaköyde Poğaça Ye \n";
                yemekListemeEkle5.setVisibility(View.GONE);
            }
        });


        yemekListemeEkle6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Beyoğlunda Çikolata Ye \n";
                yemekListemeEkle6.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Alibeyköyde Tulumba Ye \n";
                yemekListemeEkle7.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Çamlıcada Simit Ye \n";
                yemekListemeEkle8.setVisibility(View.GONE);
            }
        });



        yemekListemeEkle9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Sokakta Kokoreç Ye \n";
                yemekListemeEkle9.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Seyyar Pilavcılarda Pilav Ye \n";
                yemekListemeEkle10.setVisibility(View.GONE);
            }
        });


        yemekListemeEkle11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Sütlücede Uykuluk Ye \n";
                yemekListemeEkle11.setVisibility(View.GONE);
            }
        });


        yemekListemeEkle12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Sultanahmette Köfte Ye \n";
                yemekListemeEkle12.setVisibility(View.GONE);
            }
        });

        yemekListemeEkle13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Beyoğlunda Islak Hamburger Ye \n";
                yemekListemeEkle13.setVisibility(View.GONE);
            }
        });
    }
}