package com.example.petrrunuci;

import android.content.Context;

public class Engine extends Thread {
    private World world;
    private Activity2 activity;

    private int gravity = Constants.SCREEN_HEIGHT/100;
    private int runSpeed = Constants.SCREEN_HEIGHT/100;

    /* Constructor */
    public Engine(Context context, World world){
        this.world = world;
        activity = (Activity2) context;
    }//Engine

    /* Updating Methods */
    private void Gravity(){
        synchronized (world.getPetr()) {
            if (world.getPetr().isJumping()) {
                System.out.println("jumping");
                if (world.getPetr().getPosY() > world.getPetr().getJumpHeight()) {
                    world.getPetr().move(0, -gravity);
                } else {
                    world.getPetr().Jumping(false);
                }// if/else
            } else {
                if (world.getPetr().getPosY() < world.getPetr().getInitY()) {
                    System.out.println("falling");
                    world.getPetr().move(0, gravity);
                }//if
            }// if/else
        }//synchronized(petr)
    }// end Gravity

    private void shiftWorld(){

    }// end shiftWorld

    public void run(){

        do {
            try {
                Gravity();
                sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }// try/catch
        }while(!world.isEndGame());

    }//run

}//end Class Engine

/* EOF */