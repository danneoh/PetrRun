package com.example.petrrunuci;

import android.graphics.Bitmap;

public class Petr extends Entity{
    private int initY;
    private int points;
    private int jumpHeight;
    private boolean jumping;
    private Animation damage;
    private Animation jump;


    //Constructor
    public Petr(int posX, int posY){
        super(posX, posY, Constants.SCREEN_WIDTH/9, Constants.SCREEN_HEIGHT/3);
        setInitY(posY);
        setPoints(0);
        setJumpHeight(posY - getHeight());
        setIdle(Constants.petrIdle, 2);
        setMove1(Constants.petrWalk, 0.25);
        setDamage(Constants.petrHit, 2);
        setJump(Constants.petrJump, 2);

        setCurrentAnimation(getIdle());
    }//Constructor

    /* Private Methods */
    private void setInitY(int initY){
        this.initY = initY;
    }//setInitY
    private void setPoints(int points){
        this.points = points;
    }//setPoints

    private void setDamage(Bitmap[] sprites, double aniTime){
        damage = new Animation(sprites, aniTime);
    }//setDamage

    private void setDamage(Animation damage){
        this.damage = damage;
    }//copy setDamage

    private void setJumpHeight(int jumpHeight){
        this.jumpHeight = jumpHeight;
    }//setJumpHeight

    private void setJump(Bitmap[] sprites, double aniTime){
        jump = new Animation(sprites, aniTime);
    }//setJump

    private void setJump(Animation jump){
        this.jump = jump;
    }//copy setJump


    /* Public Methods */
    public int getInitY(){
        return initY;
    }//getInitY

    public void Jumping(boolean jumping){//setter method for jumping
        this.jumping = jumping;
    }//Jumping
    public boolean isJumping(){
        return jumping;
    }//isJumping

    public int getJumpHeight(){
        return jumpHeight;
    }//getJumpHeight

}//petr class