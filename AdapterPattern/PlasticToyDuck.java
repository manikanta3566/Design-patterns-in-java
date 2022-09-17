package com.practice.adapterpattern;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void Squeak() {
        System.out.println("make sound");
    }
}
