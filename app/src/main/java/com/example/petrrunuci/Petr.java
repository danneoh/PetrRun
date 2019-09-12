package com.example.petrrunuci;

import android.graphics.Bitmap;

public class Petr extends Entity{
    private int petrHeight = Constants.SCREEN_HEIGHT;
    private int points;
    private int jumpHeight;
    private boolean jumping;
    private Animation damage;
    private Animation jump;


    //Constructor
    public Petr(int posX, int posY){
        super(posX, posY, Constants.SCREEN_WIDTH/9, Constants.SCREEN_HEIGHT/3);
        setPoints(0);
        //setJumpHeight();
        setIdle(Constants.petrIdle, 2);
        setMove1(Constants.petrWalk, 0.25);
        setDamage(Constants.petrHit, 2);
        setJump(Constants.petrJump, 2);

        setCurrentAnimation(getIdle());
    }//Constructor


    private void setPoints(int points){
        this.points = points;
    }//setPoints

    private void setDamage(Bitmap[] sprites, double aniTime){
        damage = new Animation(sprites, aniTime);
    }//setDamage

    private void setDamage(Animation damage){
        this.damage = damage;
    }//copy setDamage

    private void setJump(Bitmap[] sprites, double aniTime){
        jump = new Animation(sprites, aniTime);
    }//setJump

    private void setJump(Animation jump){
        this.jump = jump;
    }//copy setJump



}//petr class