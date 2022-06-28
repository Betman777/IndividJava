package com.Zinchenko.homework.generic;

public abstract class Fruit {
    private float weightOne;

    public Fruit(float weight) {
        this.weightOne = weight;
    }

    public float getWeightOne() {
        return weightOne;
    }
}