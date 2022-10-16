package com.practice.bridgepattern;

public class BridgeDemo {
    public static void main(String[] args) {
        Vehicle vehicle1=new Bus(new Produce(),new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2=new Car(new Produce(),new Assemble());
        vehicle2.manufacture();
    }
}
