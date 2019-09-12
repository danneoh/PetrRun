package com.example.petrrunuci;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Camera extends View{
    static World world;
    Activity2 active;
    Context context;
    //Thread camView;

    public Camera(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        this.context = context;
        active = (Activity2) context;

        world = new World();

        //camView = new Thread(game);
        //camView.start();
    }

    @Override
    protected void onDraw(Canvas cam){
        //petr.getCurrentAnimation().draw(cam, petr.getRect());
        world.draw(cam);
    }
}
