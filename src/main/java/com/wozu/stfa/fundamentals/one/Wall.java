package com.wozu.stfa.fundamentals.one;

// this class is a POJO
// this stands for plain old java object
public class Wall {

    // this field is stateful
    private static int amountOfWalls = 0;
    private String paintColor;
    private boolean hasWallpaper;

    public Wall(String paintColor, boolean hasWallpaper){
        this.hasWallpaper = hasWallpaper;
        this.paintColor = paintColor;
        amountOfWalls++;
    }

    public String getPaintColor(){
        return paintColor;
    }

    public boolean getWallpaper(){
        return hasWallpaper;
    }

    public void setPaintColor(String paintColor){
        this.paintColor = paintColor;
    }

    public void setHasWallpaper(boolean hasWallpaper){
        this.hasWallpaper = hasWallpaper;
    }

    public int getAmountOfWalls(){
        return amountOfWalls;
    }

}
