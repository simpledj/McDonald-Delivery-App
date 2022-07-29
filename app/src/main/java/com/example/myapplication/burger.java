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

public class burger extends AppCompatActivity {

    PageCurlView burgerCurlView;
    ImageView ask;
    List<Integer> imageB;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        getSupportActionBar().hide();

        burgerCurlView=findViewById(R.id.curlburger);

        imageB=new ArrayList<>();
        imageB.add(R.drawable.b1);
        imageB.add(R.drawable.b2);
        imageB.add(R.drawable.b3);
        imageB.add(R.drawable.b4);
        imageB.add(R.drawable.b5);
        imageB.add(R.drawable.b6);
        imageB.add(R.drawable.b7);
        imageB.add(R.drawable.b8);
        imageB.add(R.drawable.b9);

        burgerCurlView.setCurlView(imageB);
        burgerCurlView.setCurlSpeed(800);

        bottomNavigationView=findViewById(R.id.botnavbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = new Intent (burger.this, MainActivity.class);
                startActivity(intent);
                return false;
            }
        });

        ask=findViewById(R.id.asktoast);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(burger.this, "Swipe right or left to see other photos", Toast.LENGTH_LONG).show();
            }
        });


    }
}