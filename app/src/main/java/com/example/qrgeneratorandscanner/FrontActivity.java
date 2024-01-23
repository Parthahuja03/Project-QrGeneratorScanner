package com.example.qrgeneratorandscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FrontActivity extends AppCompatActivity {
    TextView generatorClass, scannerClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        generatorClass = findViewById(R.id.imageView1);
        scannerClass = findViewById(R.id.imageView2);

        generatorClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        scannerClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this,scannerActivity.class);
                startActivity(intent);
            }
        });
    }
}