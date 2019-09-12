package com.example.petrrunuci;

import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Constants.CURRENT_CONTEXT = this;

        //Constants.petrSprite = BitmapFactory.decodeResource(getResources(), R.drawable.bitpetr);

    }//onCreate
}//Hello
