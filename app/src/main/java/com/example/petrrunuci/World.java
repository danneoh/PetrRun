package com.example.petrrunuci;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import static com.example.petrrunuci.Constants.SCREEN_HEIGHT;
import static com.example.petrrunuci.Constants.SCREEN_WIDTH;

public class World {
    private Petr petr;
    private Pole pole;

    public World(){
        petr = new Petr((SCREEN_WIDTH/9), (SCREEN_HEIGHT/4)*2);
        //petr.getCurrentAnimation().play();
        pole = new Pole((SCREEN_WIDTH/15),((SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/5));
        //pole.getCurrentAnimation().play();
    }

    public void draw(Canvas cam){
        Paint p = new Paint();
        Paint polecolor = new Paint();
        int color;
        int color2;
        color = Color.BLACK;
        color2 = Color.RED;
        p.setColor(color);
        polecolor.setColor(color2);


        cam.drawRect(petr.getRect(), p);
        cam.drawRect(pole.getRect(), polecolor);
       // cam.drawBitmap(petrSprite, null, petr.getRect(), new Paint());
    }

}
