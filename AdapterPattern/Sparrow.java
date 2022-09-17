package com.practice.adapterpattern;

public class Sparrow implements Bird{
    @Override
    public void makeSound() {
        System.out.println("chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
