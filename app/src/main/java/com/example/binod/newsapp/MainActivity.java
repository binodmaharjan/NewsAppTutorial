package com.example.binod.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.binod.newsapp.utilities.FormValidation;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText etPassword;
    private EditText etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();

    }

    public void initUi(){
         btnLogin = (Button)findViewById(R.id.btn_login);

         btnLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Log.i("MainActivity","valid " +isValid());
                 if(isValid()){

                     Intent i = new Intent(MainActivity.this,SecondActivity.class);
                     i.putExtra("username",etUsername.getText().toString());
                     startActivity(i);
                 }

             }
         });

         etPassword=(EditText)findViewById(R.id.et_password);
         etUsername=(EditText)findViewById(R.id.et_username);



    }

    //  validation comments
    // some text here


    public boolean isValid(){

        FormValidation validation= new FormValidation();

        if(validation.isEmpty(etUsername,"Username is empty.")) return false;
        if( !validation.inRange(etUsername,"Username should be in between 4 to 10",4,10)) return false;
        if(validation.isEmpty(etPassword,"Password is empty"))return false;
        if( !validation.inRange(etPassword,"Password should be in between 4 to 10",4,10)) return false;


       return true;
    }









}
