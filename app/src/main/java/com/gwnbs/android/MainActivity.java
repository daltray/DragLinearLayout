package com.gwnbs.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gwnbs.library.GwnbsDragLinear;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GwnbsDragLinear gwnbsDragLinear = new GwnbsDragLinear(this);
    }
}