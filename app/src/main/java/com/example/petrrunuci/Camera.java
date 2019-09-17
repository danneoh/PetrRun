package com.example.petrrunuci;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Camera extends View{
    static World world;
    Activity2 active;
    Context context;
    private final long FPS = 30; //Frames Per Second
    private long timeStamp;
    //Thread camView;

    public Camera(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        this.context = context;
        active = (Activity2) context;

        world = new World();

        //camView = new Thread(game);
        //camView.start();
    }//end Constructor Camera

    @Override
    protected void onDraw(Canvas cam){
        //petr.getCurrentAnimation().draw(cam, petr.getRect());
        world.draw(cam);
        timeStamp = System.currentTimeMillis();
        try{
            Thread.sleep(1000/FPS);
        }catch(Exception e){
            System.out.println("Error: Thread Camera/onDraw Interrupted.");
        }//end try/catch
        invalidate();
    }//end onDraw
}//end class Camera
