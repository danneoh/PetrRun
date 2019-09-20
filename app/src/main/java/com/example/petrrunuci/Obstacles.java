package com.example.petrrunuci;

import android.graphics.Rect;

public class Obstacles extends Entity {
    int speed;

    public Obstacles(int posX, int posY, int width, int height, int speed){
        super(posX, posY, width, height);
        this.speed = speed;
    }//Constructor Obstacles

    public int getSpeed(){
        return speed;
    }//getSpeed
}//Obstacles
