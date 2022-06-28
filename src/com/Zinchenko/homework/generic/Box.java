package com.Zinchenko.homework.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruit;

    public Box(T... fruit) {
        this.fruit = new ArrayList<T>(Arrays.asList(fruit));
    }

    public void addOneFruit(T fruit) {
        this.fruit.add(fruit);
    }

    public void addManyFruit(T... fruit) {
        this.fruit.addAll(Arrays.asList(fruit));

    }

    public float getWeight() {
        if (fruit.size() == 0) {
            return 0;
        } else {
            return ((fruit.size()) * fruit.get(0).getWeightOne());
        }
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        } else {
            throw new RuntimeException("Weigh of 2 boxes NOT equals!");

        }
    }

    public void merge(Box<? super T> box) {
        this.fruit.addAll(fruit);
        box.fruit.clear();
    }
}

