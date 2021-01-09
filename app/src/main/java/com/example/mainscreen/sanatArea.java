package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sanatArea extends AppCompatActivity {
    private Button sanatListemeEkle1;
    private Button sanatListemeEkle2;
    private Button sanatListemeEkle3;
    private Button sanatListemeEkle4;
    private Button sanatListemeEkle5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanat_area);

        sanatListemeEkle1 =findViewById(R.id.sanatListemeEkle1);
        sanatListemeEkle2 =findViewById(R.id.sanatListemeEkle2);
        sanatListemeEkle3 =findViewById(R.id.sanatListemeEkle3);
        sanatListemeEkle4 =findViewById(R.id.sanatListemeEkle4);
        sanatListemeEkle5 =findViewById(R.id.sanatListemeEkle5);

        sanatListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Türk ve İslam Eserleri Müzesine git \n";
                sanatListemeEkle1.setVisibility(View.GONE);
            }
        });

        sanatListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"İstanbul Moderne git \n";
                sanatListemeEkle2.setVisibility(View.GONE);
            }
        });

        sanatListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list = List.list + "Büyük Saray Mozaikler Müzesine git \n";
                sanatListemeEkle3.setVisibility(View.GONE);
            }
        });

        sanatListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Kariye Müzesine git \n";
                sanatListemeEkle4.setVisibility(View.GONE);
            }
        });

        sanatListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Borusan Contemporarye git \n";
                sanatListemeEkle5.setVisibility(View.GONE);
            }
        });
    }
}