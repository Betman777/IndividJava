package com.Zinchenko.homework.oop;
public class Treadmill implements Obstacle{
    private int length ;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        return false;

    }
}
