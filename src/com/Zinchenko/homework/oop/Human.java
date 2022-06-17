package com.Zinchenko.homework.oop;

public class Human extends Competitor {


    public Human(String name, int distance, double jumpToHeight) {
        super(name, distance, jumpToHeight);

    }


    @Override
    public boolean run(int distance) {
        if (this.distance >= distance) {
            System.out.println("Human: " + getName() + " passed the obstacle \"Treadmill \"" + " at a distance " + getDistance() + " meters" );
            return true;
        } else {
            System.out.println("Human: " + getName() + " did not pass the obstacle \"Treadmill \"" + " at a distance " + getDistance() + " meters");
            System.out.println( getName() + " - Dropped out of competition");
            return false;
        }


    }

    @Override
    public boolean jump(double height) {

        if (this.jumpToHeight >= height) {
            System.out.println("Human: " + getName() + " passed the obstacle \" Wall \"" + " at a distance " + getJumpToHeight() + " meters");

            return true;
        } else {
            System.out.println("Human: " + getName() + " did not pass the obstacle \" Wall \"" + " at a distance " + getJumpToHeight() + " meters");
            System.out.println(getName() + " - Dropped out of competition");
            return false;
        }
    }
}