package com.example.a15017519.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivDay2,ivDay3,ivDay4;

        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        // Set the image
        ivDay2.setImageResource(R.drawable.day2);
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        // Set the image
        ivDay3.setImageResource(R.drawable.day3);
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        // Set the image
        ivDay4.setImageResource(R.drawable.day4);

    }
}
