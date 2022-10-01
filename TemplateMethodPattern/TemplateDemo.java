package com.practice.templatePattern;

public class TemplateDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.startGame();
        game=new Football();
        game.startGame();
    }
}
