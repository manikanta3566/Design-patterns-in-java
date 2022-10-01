package com.practice.templatePattern;

public abstract class Game {
    abstract void initialize();
    abstract void play();
    abstract void end();

    //template method
    final void startGame(){
        initialize();
        play();
        end();
    }
}
