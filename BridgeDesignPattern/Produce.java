package com.practice.bridgepattern;

public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.println("produced");
    }
}
