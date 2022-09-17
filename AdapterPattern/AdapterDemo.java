package com.practice.adapterpattern;

public class AdapterDemo {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        ToyDuck toyDuck=new PlasticToyDuck();

        ToyDuck toyDuckAdapter=new BirdAdapter(sparrow);
        System.out.println("sparrow");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("toyduck");
        toyDuckAdapter.Squeak();
    }
}
