package edu.orangecoastcollege.cs273.jburk.paintestimator;

/**
 * Created by jimburk on 9/19/17.
 */

public class InteriorRoom {
    public static final float DOOR_AREA = 21f;
    public static final float WINDOW_AREA = 16f;
    public static final float SQ_FEET_PER_GALLON = 275f;

    private float mLength;
    private float mWidth;
    private float mHeight;

    private int mDoors;
    private int mWindows;

    public InteriorRoom() {
    }

    public float getLength() {
        return mLength;
    }

    public float getWidth() {
        return mWidth;
    }

    public float getHeight() {
        return mHeight;
    }

    public int getDoors() {
        return mDoors;
    }

    public int getWindows() {
        return mWindows;
    }

    public void setLength(float length) {
        mLength = length;
    }

    public void setWidth(float width) {
        mWidth = width;
    }

    public void setHeight(float height) {
        mHeight = height;
    }

    public void setDoors(int doors) {
        mDoors = doors;
    }

    public void setWindows(int windows) {
        mWindows = windows;
    }

    public float doorAndWindowArea() {
        return mDoors * DOOR_AREA + mWindows * WINDOW_AREA;
    }

    public float wallSurfaceArea() {
        return 2 * mWidth * mHeight + 2 * mLength * mHeight + mLength * mWidth;
    }

    public float totalSurfaceArea() {
        return wallSurfaceArea() - doorAndWindowArea();
    }

    public float gallonsOfPaintRequired() {
        return totalSurfaceArea() / SQ_FEET_PER_GALLON;
    }
}
