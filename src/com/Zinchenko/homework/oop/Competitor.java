package com.Zinchenko.homework.oop;

public abstract class Competitor {
    protected String name;
    protected int distance;
    protected double jumpToHeight;

    public Competitor(String name, int distance, double jumpToHeight) {
        this.name = name;
        this.distance = distance;
        this.jumpToHeight = jumpToHeight;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public double getJumpToHeight() {
        return jumpToHeight;
    }

    public abstract boolean run();

    public abstract boolean jump();
}
