package com.example.petrrunuci;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.Vector;

import static com.example.petrrunuci.Constants.SCREEN_HEIGHT;
import static com.example.petrrunuci.Constants.SCREEN_WIDTH;

public class World {
    private boolean endGame;

    private Petr petr;
    private Vector<Obstacles> obstacles = new Vector<Obstacles>(10);
    private Pole pole;
    private Bush bush;
    private BikeRack br;

    public World(){
        setEndGame(false);

        petr = new Petr((SCREEN_WIDTH/9), (SCREEN_HEIGHT/4)*2);

        pole = new Pole((SCREEN_WIDTH/15),((SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/5));

        bush = new Bush((SCREEN_WIDTH/5), ((SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/7));

        br = new BikeRack((SCREEN_WIDTH/7), ((SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/10));
    }//Constructor World

    public void setEndGame(boolean endGame){
        this.endGame = endGame;
    }//setEndGame

    public boolean isEndGame(){
        return endGame;
    }//isEndGame

    public Petr getPetr(){
        return petr;
    }//getPetr

    public Vector<Obstacles> getObstacles(){
        return obstacles;
    }//getObstacles

    public void draw(Canvas cam){
        Paint p = new Paint();
        Paint poleColor = new Paint();
        Paint bushColor = new Paint();
        Paint bikeColor = new Paint();

        int color;
        int color2;
        int color3;
        int color4;

        color = Color.BLACK;
        color2 = Color.RED;
        color3 = Color.GREEN;
        color4 = Color.BLUE;

        p.setColor(color);
        poleColor.setColor(color2);
        bushColor.setColor(color3);
        bikeColor.setColor(color4);

        cam.drawRect(petr.getRect(), p);

        for(int c = 0; c < 10; c++){
            if(getObstacles().get(c) != null) {
                if (getObstacles().get(c) instanceof BikeRack) {
                    cam.drawRect(getObstacles().get(c).getRect(), bikeColor);
                } else if (getObstacles().get(c) instanceof Bush) {
                    cam.drawRect(getObstacles().get(c).getRect(), bushColor);
                } else if (getObstacles().get(c) instanceof Pole) {
                    cam.drawRect(getObstacles().get(c).getRect(), poleColor);
                }// if/elif/elif
            }//if
        }//for

       /*
        cam.drawRect(pole.getRect(), poleColor);
        cam.drawRect(bush.getRect(), bushColor);
        cam.drawRect(br.getRect(), bikeColor); /**/
       // cam.drawBitmap(petrSprite, null, petr.getRect(), new Paint());
    }//draw

}//class World

/* EOF */
