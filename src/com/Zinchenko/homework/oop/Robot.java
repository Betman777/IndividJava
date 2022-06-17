package com.Zinchenko.homework.oop;
public class Robot extends Competitor{


    public Robot(String name, int distance, double jumpToHeight) {
        super(name, distance, jumpToHeight);
    }

    @Override
    public boolean  run (Treadmill treadmill) {
        if(this.distance >= getDistance()) {
            System.out.println("Human" + getName() + "runned");
        }else {
            System.out.println("you luse");

        }
        return false;

    }

    @Override
    public boolean  jump (Wall wall) {
        if(this.jumpToHeight >= getJumpToHeight()) {
            System.out.println("Human" + getName() + "jumping");
        }else {
            System.out.println("you luse");

        }
        return false;

    }
}
