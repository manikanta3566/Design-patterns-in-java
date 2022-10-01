package com.practice.templatePattern;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("cricket game is initialized");
    }

    @Override
    void play() {
        System.out.println("cricket game playing");
    }

    @Override
    void end() {
        System.out.println("cricket game ending \n");
    }
}
