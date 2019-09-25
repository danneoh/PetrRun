package com.example.petrrunuci;

import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class Activity2 extends AppCompatActivity {

    private ConstraintLayout screen = null;//connected to layout and used for user interaction

    TextView scoreView;

    public TextView getScoreView(){
        return scoreView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setRequestedOrientation(SCREEN_ORIENTATION_LANDSCAPE);

        scoreView = findViewById(R.id.points);
        scoreView.setText("Points: " + Integer.toString(Camera.getWorld().getPetr().getPoints()));

        Constants.CURRENT_CONTEXT = this;

        screen = findViewById(R.id.screen);
        screen.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                        System.out.println("screen pressed");
                        synchronized (Camera.getWorld().getPetr()) {
                            if (!Camera.getWorld().getPetr().isJumping()){
                                Camera.getWorld().getPetr().Jumping(true);
                                System.out.println("start jumping");
                            }//if
                        }//synchronized(petr)
                }//if
                return true;
            }//onTouch
        });//screen.setOnTouchListener

        //Constants.petrSprite = BitmapFactory.decodeResource(getResources(), R.drawable.bitpetr);
        Constants.petrSprite = BitmapFactory.decodeResource(getResources(), R.drawable.bitpeter);

    }//onCreate
}//Hello
