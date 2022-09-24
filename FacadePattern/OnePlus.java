package com.practice.FacadePattern;

public class OnePlus implements MobileShop {
    @Override
    public void printModelName() {
        System.out.println("one plus 9R");
    }

    @Override
    public void printPrice() {
        System.out.println("420000");
    }
}
