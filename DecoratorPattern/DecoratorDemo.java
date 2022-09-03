package com.practice.decoratorpattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
        System.out.println("normal circle");
        circle.draw();
        System.out.println("\ncircle with red border");
        redCircle.draw();
        System.out.println("\nrectangle with green border");
        greenRectangle.draw();
    }
}
