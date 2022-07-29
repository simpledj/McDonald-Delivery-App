package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class chicken extends AppCompatActivity {

    PageCurlView chickenCurlView, spicychickenCurlView;
    ImageView ask;
    List<Integer> imageC, imageSC;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        getSupportActionBar().hide();

        chickenCurlView=findViewById(R.id.curlchicken);

        imageC=new ArrayList<>();
        imageC.add(R.drawable.c1);
        imageC.add(R.drawable.c2);
        imageC.add(R.drawable.c3);
        imageC.add(R.drawable.c4);
        imageC.add(R.drawable.c5);
        imageC.add(R.drawable.c6);
        imageC.add(R.drawable.c7);

        chickenCurlView.setCurlView(imageC);
        chickenCurlView.setCurlSpeed(800);

        spicychickenCurlView=findViewById(R.id.curlspicychicken);

        imageSC=new ArrayList<>();
        imageSC.add(R.drawable.sc1);
        imageSC.add(R.drawable.sc2);
        imageSC.add(R.drawable.sc3);
        imageSC.add(R.drawable.sc4);
        imageSC.add(R.drawable.sc5);
        imageSC.add(R.drawable.sc6);
        imageSC.add(R.drawable.sc7);

        spicychickenCurlView.setCurlView(imageSC);
        spicychickenCurlView.setCurlSpeed(800);

        bottomNavigationView=findViewById(R.id.botnavbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = new Intent (chicken.this, MainActivity.class);
                startActivity(intent);
                return false;
            }
        });

        ask=findViewById(R.id.asktoast);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(chicken.this, "Swipe right or left to see other photos", Toast.LENGTH_LONG).show();
            }
        });


    }
}
