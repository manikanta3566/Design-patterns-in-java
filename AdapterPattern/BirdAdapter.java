package com.practice.adapterpattern;

// You need to implement the interface your client expects to use.
public class BirdAdapter implements ToyDuck {
    Bird bird;

    BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void Squeak() {
        bird.makeSound();
    }
}
