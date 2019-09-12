package com.example.petrrunuci;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class World {
    private Petr petr;
    private Petr wow;

    public World(){
        petr = new Petr(0, 0);
        petr.getCurrentAnimation().play();
    }

    public void draw(Canvas cam){
        Paint p = new Paint();
        int color;
        color = Color.RED;
        p.setColor(color);

        //petr.getCurrentAnimation().draw(cam, petr.getRect());
        cam.drawRect(petr.getRect(), p);
    }

}
