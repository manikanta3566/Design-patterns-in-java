package com.practice.factorypattern;

public abstract class CricketBatCompany {
    protected String name;
    protected String price;
    public CricketBatCompany(String name,String price){
        this.name=name;
        this.price=price;
    }
    public abstract void printBatCompany();
    public abstract void printBatPrice();
    }

