package com.example.petrrunuci;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

public class Constants {
    public static final int SCREEN_HEIGHT = Resources.getSystem().getDisplayMetrics().widthPixels;
    public static final int SCREEN_WIDTH = Resources.getSystem().getDisplayMetrics().heightPixels;

    public static Context CURRENT_CONTEXT;

    //Sprites for Level
    public static Bitmap[] level = new Bitmap[3];

    //Sprites for future Building obstacle
    public static Bitmap[] buildingIdle = new Bitmap[1];

    //Sprites for Petr
    public static Bitmap petrSprite;
    public static Bitmap[] petrIdle = new Bitmap[1];
    public static Bitmap[] petrIdleLeft = new Bitmap[1];
    public static Bitmap[] petrWalk = new Bitmap[4];
    public static Bitmap[] petrWalkLeft = new Bitmap[4];
    public static Bitmap[] petrHit = new Bitmap[1];
    public static Bitmap[] petrJump = new Bitmap[1];
    public static Bitmap[] petrJumpLeft = new Bitmap[1];

}// Class Constants

/* EOF */
