package com.example.petrrunuci;

import android.graphics.Bitmap;

public class Petr extends Entity{
    private int petrHeight = Constants.SCREEN_HEIGHT;
    private int lives;
    private int points;
    private int jumpHeight;
    private boolean faceRight;
    private boolean jumping;
    private Animation idleLeft;
    private Animation damage;
    private Animation jump;
    private Animation jumpLeft;


    //Constructor
    public Petr(int posX, int posY){
        super(posX, posY, Constants.SCREEN_WIDTH/9, Constants.SCREEN_HEIGHT/3);
        faceRight(true);
        setPoints(0);
        setRelPos(posX + (Constants.SCREEN_WIDTH/20)/2);
        //setJumpHeight();
        setIdle(Constants.petrIdle, 2);
        setIdleLeft(Constants.petrIdleLeft, 2);
        setMove1(Constants.petrWalk, 0.25);
        setMove2(Constants.petrWalkLeft, 0.25);
        setDamage(Constants.petrHit, 2);
        setJump(Constants.petrJump, 2);
        setJumpLeft(Constants.petrJumpLeft, 2);

        setCurrentAnimation(getIdle());
    }//Constructor

    public void faceRight(boolean face){
        faceRight = face;
    }//faceRight

    public void setLives(int lives){
        this.lives = lives;
    }//setLives

    private void setPoints(int points){
        this.points = points;
    }//setPoints

    private void setIdleLeft(Bitmap[] sprites, double aniTime){
        idleLeft = new Animation(sprites, aniTime);
    }//setIdleLeft

    private void setIdleLeft(Animation idleLeft){
        this.idleLeft = idleLeft;
    }//copy setIdleLeft

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

    private void setJumpLeft(Bitmap[] sprites, double aniTime){
        jumpLeft = new Animation(sprites, aniTime);
    }//setJumpLeft

    private void setJumpLeft(Animation jumpLeft){
        this.jumpLeft = jumpLeft;
    }//copy setJumpLeft

}//petr class