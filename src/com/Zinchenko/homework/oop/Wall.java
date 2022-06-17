package com.Zinchenko.homework.oop;


public class Wall implements Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        return competitor.jump(height);

    }
}
