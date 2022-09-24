package com.practice.FacadePattern;

public class Samsung implements MobileShop {
    @Override
    public void printModelName() {
        System.out.println("samsung galaxys");
    }

    @Override
    public void printPrice() {
        System.out.println("40000");
    }
}
