package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import app.num.numandroidpagecurleffect.PageCurlView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class featured extends AppCompatActivity {

    PageCurlView pageCurlView;
    ImageView ask;
    List<Integer> image;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured);
        getSupportActionBar().hide();

        pageCurlView=findViewById(R.id.curlfeatured);

        image=new ArrayList<>();
        image.add(R.drawable.mothersday);
        image.add(R.drawable.spaghettiplatter);

        pageCurlView.setCurlView(image);
        pageCurlView.setCurlSpeed(800);

        bottomNavigationView=findViewById(R.id.botnavbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = new Intent (featured.this, MainActivity.class);
                startActivity(intent);
                return false;
            }
        });

        ask=findViewById(R.id.asktoast);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(featured.this, "Swipe right or left to see other photos", Toast.LENGTH_LONG).show();
            }
        });


    }
}