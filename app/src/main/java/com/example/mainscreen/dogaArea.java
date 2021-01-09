package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dogaArea extends AppCompatActivity {
        private Button dogaListemeEkle1;
        private Button dogaListemeEkle2;
        private Button dogaListemeEkle3;
        private Button dogaListemeEkle4;
        private Button dogaListemeEkle5;
        private Button dogaListemeEkle6;
        private Button dogaListemeEkle7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doga_area);

        dogaListemeEkle1 = findViewById(R.id.dogaListemeEkle1);
        dogaListemeEkle2 = findViewById(R.id.dogaListemeEkle2);
        dogaListemeEkle3 = findViewById(R.id.dogaListemeEkle3);
        dogaListemeEkle4 = findViewById(R.id.dogaListemeEkle4);
        dogaListemeEkle5 = findViewById(R.id.dogaListemeEkle5);
        dogaListemeEkle6 = findViewById(R.id.dogaListemeEkle6);
        dogaListemeEkle7 = findViewById(R.id.dogaListemeEkle7);

        dogaListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Emirgan Korusuna git \n";
                dogaListemeEkle1.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"İstanbul Sea Life Akvaryuma git \n";
                dogaListemeEkle2.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Belgrad Ormanına git \n";
                dogaListemeEkle3.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Polonezköye git \n";
                dogaListemeEkle4.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Büyükadaya git \n";
                dogaListemeEkle5.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Göktürk Göleti Tabiat Parkına git \n";
                dogaListemeEkle6.setVisibility(View.GONE);
            }
        });

        dogaListemeEkle7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Atatürk Arboretumuna git \n";
                dogaListemeEkle7.setVisibility(View.GONE);
            }
        });









    }
}