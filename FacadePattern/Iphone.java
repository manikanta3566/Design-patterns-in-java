package com.practice.FacadePattern;

public class Iphone implements MobileShop {
    @Override
    public void printModelName() {
        System.out.println("iphone 14");
    }

    @Override
    public void printPrice() {
        System.out.println("80000");
    }
}
