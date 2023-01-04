package com.example.expcanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
MyCanvas myCan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //à enlever
      //  setContentView(R.layout.activity_main);
        myCan = new MyCanvas(this);
        setContentView(myCan);
    }
}