package com.practice.bridgepattern;

public class Bus extends Vehicle{
    public Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("bus");
        workshop1.work();
        workshop2.work();
    }
}
