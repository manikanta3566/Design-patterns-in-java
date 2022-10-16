package com.practice.bridgepattern;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
