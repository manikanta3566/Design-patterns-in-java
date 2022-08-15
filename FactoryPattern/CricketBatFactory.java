package com.practice.factorypattern;

public class CricketBatFactory {
    public static CricketBatCompany getCricketBatCompany(String type){
        if ("puma".equalsIgnoreCase(type)){
            return new Puma("puma","5000");
        } else if ("nike".equalsIgnoreCase(type)) {
            return new Nike("Nike","7000");
        }else if ("reebook".equalsIgnoreCase(type)) {
            return new Reebook("reebook","10000");
        }else {
            return null;
        }
    }
}
