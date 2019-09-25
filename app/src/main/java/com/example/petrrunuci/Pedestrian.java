package com.example.petrrunuci;

public class Pedestrian extends Obstacles {
    public Pedestrian(int posX, int posY){
        super(posX, posY, (Constants.SCREEN_WIDTH/25), (Constants.SCREEN_HEIGHT/4), 0);
    }//constructor
}//Pedestrian
