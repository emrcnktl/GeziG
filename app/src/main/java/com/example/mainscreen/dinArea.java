package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dinArea extends AppCompatActivity {
    private Button dinListemeEkle1;
    private Button dinListemeEkle2;
    private Button dinListemeEkle3;
    private Button dinListemeEkle4;
    private Button dinListemeEkle5;
    public String dinString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_din_area);

        dinListemeEkle1 = findViewById(R.id.dinListemeEkle1);
        dinListemeEkle2 = findViewById(R.id.dinListemeEkle2);
        dinListemeEkle3 = findViewById(R.id.dinListemeEkle3);
        dinListemeEkle4 = findViewById(R.id.dinListemeEkle4);
        dinListemeEkle5 = findViewById(R.id.dinListemeEkle5);

        dinListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
               List.list =List.list +"Süleymaniye Camiiye git \n";
               dinListemeEkle1.setVisibility(View.GONE);
            }
        });

        dinListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list = List.list +"Ayasofya Camiiye git \n";
                dinListemeEkle2.setVisibility(View.GONE);
            }
        });

        dinListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list = List.list +"Sultan Ahmet Camiiye git \n";
                dinListemeEkle3.setVisibility(View.GONE);
            }
        });


        dinListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list = List.list +"Rum Ortodoks Patrikhanesine git \n";
                dinListemeEkle4.setVisibility(View.GONE);
            }
        });

        dinListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list = List.list +"Aya Yorgi Patrikhane Kilisesine git \n";
               dinListemeEkle5.setVisibility(View.GONE);
            }
        });





    }
}