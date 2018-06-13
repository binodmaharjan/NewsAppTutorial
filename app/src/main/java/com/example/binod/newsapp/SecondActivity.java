package com.example.binod.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initUI();

        String username = getIntent().getStringExtra("username");
        tvUsername.setText("Hello "+username);
    }

    public void initUI(){
         tvUsername = (TextView)findViewById(R.id.tv_username);
    }



}
