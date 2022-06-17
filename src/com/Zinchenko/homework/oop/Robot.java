package com.Zinchenko.homework.oop;

public class Robot extends Competitor {


    public Robot(String name, int distance, double jumpToHeight) {
        super(name, distance, jumpToHeight);
    }

    @Override
    public boolean run(int length) {
        if (getDistance() >= length) {
            System.out.println("Robot" + getName() + "runned" + getDistance() + "metr");
            return true;
        } else {
            System.out.println(getName() + "you luse");
            return false;
        }


    }

    @Override
    public boolean jump(double heigth) {
        if (this.jumpToHeight >= heigth) {
            System.out.println("Robot" + getName() + "jumping" + getJumpToHeight() + "metr");
            return true;
        } else {
            System.out.println(getName() + "you luse");
            return false;
        }
    }
}