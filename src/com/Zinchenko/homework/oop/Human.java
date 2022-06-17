package com.Zinchenko.homework.oop;

public class Human extends Competitor {


    public Human(String name, int distance, double jumpToHeight) {
        super(name, distance, jumpToHeight);
    }



    @Override
    public boolean   run(Treadmill treadmill ) {
        if(getDistance()>= treadmill.getLength()) {
            System.out.println("Human" + getName() + "runned");
            return true;
        }else {
            System.out.println("you luse");
            return false;
        }


    }

    @Override
    public boolean  jump (Wall wall) {
        if(this.jumpToHeight >= wall.getHeight()) {
            System.out.println("Human" + getName() + "jumping");
            return true;
        }else {
            System.out.println("you luse");
            return false;
        }


    }


}


