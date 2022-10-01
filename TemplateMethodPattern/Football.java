package com.practice.templatePattern;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football game is initializing");
    }

    @Override
    void play() {
        System.out.println("Football game playing");
    }

    @Override
    void end() {
        System.out.println("Football game ending \n");
    }
}
