package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import app.num.numandroidpagecurleffect.PageCurlView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class group extends AppCompatActivity {

    PageCurlView gchickenCurlView, nuggetsCurlView;
    ImageView ask;
    List<Integer> imageC, imageN;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        getSupportActionBar().hide();

        gchickenCurlView=findViewById(R.id.curlgroupchicken);

        imageC=new ArrayList<>();
        imageC.add(R.drawable.chicken6pcs);
        imageC.add(R.drawable.chicken8pcs);
        imageC.add(R.drawable.chicken10pcs);
        imageC.add(R.drawable.chicken15pcs);
        imageC.add(R.drawable.chicken20pcs);

        gchickenCurlView.setCurlView(imageC);
        gchickenCurlView.setCurlSpeed(800);


        nuggetsCurlView=findViewById(R.id.curlnuggets);

        imageN=new ArrayList<>();
        imageN.add(R.drawable.nuggets10);
        imageN.add(R.drawable.nuggets20);
        imageN.add(R.drawable.nuggets40);
        imageN.add(R.drawable.nuggets60);
        imageN.add(R.drawable.nuggets80);

        nuggetsCurlView.setCurlView(imageN);
        nuggetsCurlView.setCurlSpeed(800);

        bottomNavigationView=findViewById(R.id.botnavbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = new Intent (group.this, MainActivity.class);
                startActivity(intent);
                return false;
            }
        });

        ask=findViewById(R.id.asktoast);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(group.this, "Swipe right or left to see other photos", Toast.LENGTH_LONG).show();
            }
        });


    }
}