package com.example.petrrunuci;

import android.content.Context;
import java.util.Random;

import static com.example.petrrunuci.Constants.SCREEN_HEIGHT;

public class Engine extends Thread {
    private World world;
    private Activity2 activity;

    private int gravity = Constants.SCREEN_HEIGHT/75;
    private int runSpeed = Constants.SCREEN_HEIGHT/100;

    private Random rand;
    private int numObst = 3;
    private int obstDistance = 100;
    private int distIt = 0;
    private int points = 0;

    /* Constructor */
    public Engine(Context context, World world){
        this.world = world;
        activity = (Activity2) context;

        rand = new Random();
    }//Engine

    /* Updating Methods */
    private void Initialize(){
        synchronized (world.getObstacles()){
            if(world.getObstacles().isEmpty()){
                for(int c = 0; c < 10; c++){
                    world.getObstacles().add(randObstacle(rand.nextInt(numObst)));
                }//for
            }//if
        }//synchronized
    }//Initialize

    private Obstacles randObstacle(int id){
        int placeX = 20 * Constants.SCREEN_WIDTH;


        switch(id){
            case 0:
                return new BikeRack(Constants.SCREEN_WIDTH,((Constants.SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/10));
            case 1:
                return new Bush(Constants.SCREEN_WIDTH,((Constants.SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/7) );
            case 2:
                return new Pole(Constants.SCREEN_WIDTH, ((Constants.SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/5));
            default:
                return new Bush(Constants.SCREEN_WIDTH,((SCREEN_HEIGHT/4)*2) + (Constants.SCREEN_HEIGHT/3) - (Constants.SCREEN_HEIGHT/7));
        }//switch
    }//randObstacle

    private void Gravity(){
        synchronized (world.getPetr()) {
            if (world.getPetr().isJumping() && false == world.getPetr().isFalling()) {
                System.out.println("jumping");
                if (world.getPetr().getPosY() > world.getPetr().getJumpHeight()) {
                    world.getPetr().move(0, -gravity);
                }
                else {
                    world.getPetr().Jumping(false);
                    world.getPetr().setFalling(true);
                }// if/else
            }//if
            else {
                if (world.getPetr().getPosY() < world.getPetr().getInitY()) {
                    System.out.println("falling");
                    world.getPetr().move(0, gravity);
                    world.getPetr().setFalling(true);
                }//if
                else{world.getPetr().setFalling(false);}
            }// if/else
        }//synchronized(petr)
    }// end Gravity

    private void shiftWorld() {
        synchronized (world.getObstacles()) {
            if (world.getObstacles().isEmpty()) {
                world.getObstacles().add(randObstacle(rand.nextInt(numObst)));
            }//if

            for (int c = 0; c < world.getObstacles().size(); c++) {
                world.getObstacles().get(c).move(-(runSpeed + world.getObstacles().get(c).getSpeed()), 0);
                if ((world.getObstacles().get(c).getPosX() + world.getObstacles().get(c).getWidth()) <= 0) {
                    world.getObstacles().remove(c);
                    world.getPetr().addPoints(1);
                    updateView();
                }//if
            }//for

            if (distIt >= (obstDistance + rand.nextInt(60))) {
                if (distIt >= (obstDistance + rand.nextInt(150))) {
                    world.getObstacles().add(randObstacle(rand.nextInt(numObst)));
                /*world.getPetr().addPoints(1);
                updateView();*/
                    distIt = 0;
                }//if

                distIt++;
            }//synchronized
        }// end shiftWorld
    }

    public void updateView(){
         //world.getPetr().addPoints(1);
         activity.getScoreView().setText("Points: " + Integer.toString(world.getPetr().getPoints()));
    }

    public void run(){
        //Initialize();

       do {
            try {
                Gravity();
                shiftWorld();
                //newScore();
                //updateView();
                sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }// try/catch
        }while(!world.isEndGame());

    }//run

}//end Class Engine

/* EOF */