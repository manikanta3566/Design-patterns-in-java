package com.practice.prototypepattern;

public class Red implements Color{
    private String name;

    public Red(String name) {
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
        Red red=null;
        try {
            red=(Red) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return red;
    }
}
