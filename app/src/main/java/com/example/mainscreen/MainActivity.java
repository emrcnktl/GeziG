package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button dinButton;
    private Button listemButton;
    private Button yemekButton;
    private Button sporButton;
    private Button dogaButton;
    private Button tarihButton;
    private Button sanatButton;
    private Button eglenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dinButton = (Button)findViewById(R.id.dinButton);
        listemButton =(Button)findViewById(R.id.listemButton) ;
        yemekButton = (Button)findViewById(R.id.yemekButton);
        dogaButton = (Button)findViewById(R.id.dogaButton);
        tarihButton = (Button)findViewById(R.id.tarihButton);
        sanatButton = (Button)findViewById(R.id.sanatButton);
        eglenceButton = (Button)findViewById(R.id.eglenceButton);
        sporButton = (Button)findViewById(R.id.sporButton);


        listemButton.setOnClickListener(new View.OnClickListener() { // for list button

            public void onClick(View v) {
                openActivity3();
            }
        });


        dinButton.setOnClickListener(new View.OnClickListener(){ // for din button
            public void onClick(View v){
                openActivity2();
            }
        });

        yemekButton.setOnClickListener(new View.OnClickListener(){ // for yemek button
            public void onClick(View v){
                openActivity1();
            }
        });

        sporButton.setOnClickListener(new View.OnClickListener(){ // for spor button
            public void onClick(View v){
                openActivity4();
            }
        });

        dogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity5();
            }
        });

        tarihButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity6();
            }
        });

        sanatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity7();
            }
        });

        eglenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity8();
            }
        });
    }

    private void OpenActivity8() {
        Intent intent = new Intent(this,eglenceArea.class);
        startActivity(intent);
    }

    private void OpenActivity7() {
        Intent intent = new Intent(this,sanatArea.class);
        startActivity(intent);
    }

    private void OpenActivity6() {
        Intent intent = new Intent(this,tarihArea.class);
        startActivity(intent);
    }

    private void OpenActivity5() {
        Intent intent = new Intent(this,dogaArea.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent = new Intent(this,sporArea.class); //spor button's intent
        startActivity(intent);
    }


    private void openActivity1() {
        Intent intent = new Intent(this,yemekArea.class); //yemek button's intent
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent = new Intent(this,Liste.class); //list button's intent
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this,dinArea.class); // din button's intent
        startActivity(intent);
    }


}