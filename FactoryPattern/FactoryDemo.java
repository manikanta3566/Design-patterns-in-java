package com.practice.factorypattern;

public class FactoryDemo {
    public static void main(String[] args) {
        CricketBatCompany company = CricketBatFactory.getCricketBatCompany("puma");
        company.printBatCompany();
        company.printBatPrice();
        System.out.println("\n");
        company = CricketBatFactory.getCricketBatCompany("nike");
        company.printBatCompany();
        company.printBatPrice();
        System.out.println("\n");
        company = CricketBatFactory.getCricketBatCompany("reebook");
        company.printBatCompany();
        company.printBatPrice();

    }
}
