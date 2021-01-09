package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eglenceArea extends AppCompatActivity {
    private Button eglenceListemeEkle1;
    private Button eglenceListemeEkle2;
    private Button eglenceListemeEkle3;
    private Button eglenceListemeEkle4;
    private Button eglenceListemeEkle5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eglence_area);

        eglenceListemeEkle1 = findViewById(R.id.eglenceListemeEkle1);
        eglenceListemeEkle2 = findViewById(R.id.eglenceListemeEkle2);
        eglenceListemeEkle3 = findViewById(R.id.eglenceListemeEkle3);
        eglenceListemeEkle4 = findViewById(R.id.eglenceListemeEkle4);
        eglenceListemeEkle5 = findViewById(R.id.eglenceListemeEkle5);

        eglenceListemeEkle1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Frankenstein Korku Evine git \n";
                eglenceListemeEkle1.setVisibility(View.GONE);
            }
        });

        eglenceListemeEkle2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Optimum Outlete git \n";
                eglenceListemeEkle2.setVisibility(View.GONE);
            }
        });

        eglenceListemeEkle3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"KidZaniaya git \n";
                eglenceListemeEkle3.setVisibility(View.GONE);
            }
        });

        eglenceListemeEkle4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"LEGOLAND® Discovery Centera \n";
                eglenceListemeEkle4.setVisibility(View.GONE);
            }
        });

        eglenceListemeEkle5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                List.list =List.list +"Özgürlük Parkına git \n";
                eglenceListemeEkle5.setVisibility(View.GONE);
            }
        });
    }
}