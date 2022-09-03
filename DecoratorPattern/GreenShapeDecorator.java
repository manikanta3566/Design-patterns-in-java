package com.practice.decoratorpattern;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setGreenBorder(shapeDecorator);
    }

    public void setGreenBorder(Shape shapeDecorator) {
        System.out.println("Border Green");
    }
}
