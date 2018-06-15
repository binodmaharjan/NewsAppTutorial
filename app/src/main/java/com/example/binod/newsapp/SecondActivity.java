package com.example.binod.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.binod.newsapp.network.DownloadImage;
import com.example.binod.newsapp.network.DownloadText;

public class SecondActivity extends AppCompatActivity {

    private TextView tvUsername;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initUI();

        String username = getIntent().getStringExtra("username");
        tvUsername.setText("Hello "+username);

        DownloadImage downloadImage =new DownloadImage("https://justifiedgrid.com/wp-content/gallery/life/biking/137646854.jpg",imageView);
        downloadImage.execute();


        DownloadText downloadText = new DownloadText("https://newsapi.org/v2/top-headlines?country=us&category=business");
        downloadText.execute();
    }

    public void initUI(){
         tvUsername = (TextView)findViewById(R.id.tv_username);
         imageView=(ImageView)findViewById(R.id.imageView);
    }



}
