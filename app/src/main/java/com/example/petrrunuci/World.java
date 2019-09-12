package com.example.petrrunuci;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import static com.example.petrrunuci.Constants.SCREEN_HEIGHT;

public class World {
    private Petr petr;

    public World(){
        petr = new Petr(0, (SCREEN_HEIGHT/4)*2);
        petr.getCurrentAnimation().play();
    }

    public void draw(Canvas cam){
        Paint p = new Paint();
        int color;
        color = Color.BLACK;
        p.setColor(color);

        cam.drawRect(petr.getRect(), p);
       // cam.drawBitmap(petrSprite, null, petr.getRect(), new Paint());
    }

}
