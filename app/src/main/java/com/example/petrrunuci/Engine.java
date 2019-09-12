package com.example.petrrunuci;

import android.content.Context;

public class Engine extends Thread {
    private World world;
    private Activity2 activity;

    private int gravity = Constants.SCREEN_HEIGHT/100;

    /* Constructor */
    public Engine(Context context, World world){
        this.world = world;
        activity = (Activity2) context;
    }//Engine

    /* Updating Methods */


}//end Class Engine

/* EOF */