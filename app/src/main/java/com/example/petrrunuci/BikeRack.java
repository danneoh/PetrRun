package com.example.petrrunuci;

import android.graphics.BitmapFactory;

public class BikeRack extends Obstacles {
    public BikeRack(int posX, int posY){
        super(posX, posY, (Constants.SCREEN_WIDTH/7), (Constants.SCREEN_HEIGHT/10), 0);
    }
}
