package com.example.petrrunuci;

import android.graphics.Rect;

public class Obstacles extends Entity {
    private Rect hitBox;
    int speed;

    public Obstacles(int posX, int posY, int width, int height, int speed){
        super(posX, posY, width, height);
        this.speed = speed;
    }//Constructor Obstacles

    public int getSpeed(){
        return speed;
    }//getSpeed

    public void setHitBox(int left, int top, int right, int bottom){
        hitBox = new Rect(left, top, right, bottom);
    }

    @Override
    public void move(int x, int y){
        super.move(x, y);
    }



}//Obstacles
