package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void click(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.button_main:
                intent = new Intent (MainActivity.this, mainn.class);
                startActivity(intent);
                break;


            case R.id.button_help:
                intent = new Intent (MainActivity.this, help.class);
                startActivity(intent);
                break;


        }
    }






}
