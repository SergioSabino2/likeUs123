package com.example.sergio.maxsword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Aplic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Intro(this));
    }
}
