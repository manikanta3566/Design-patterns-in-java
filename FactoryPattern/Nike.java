package com.practice.factorypattern;

public class Nike extends CricketBatCompany{
    public Nike(String name, String price){
        this.name=name;
        this.price=price;
    }

    @Override
    public void printBatCompany() {
        System.out.println(name);
    }

    @Override
    public void printBatPrice() {
        System.out.println(price);
    }
}
