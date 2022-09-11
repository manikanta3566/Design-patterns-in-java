package com.practice.prototypepattern;

public class Blue implements Color {
    private String name;

    public Blue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Color clone() {
        Blue blue=null;
        try {
         blue=(Blue) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return blue;
    }
}
