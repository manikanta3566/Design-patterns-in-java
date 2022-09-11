package com.practice.prototypepattern;

public class PrototypeDemo {
    public static void main(String[] args) {
       Blue blue1= new Blue("blue1");
       Blue blue2=(Blue)blue1.clone();
       blue2.setName("blue2");
        System.out.println(blue1.getName());
        System.out.println(blue2.getName());
        System.out.println(blue1.getName());
        System.out.println(System.identityHashCode(blue1) +"\n"+System.identityHashCode(blue2) );
    }
}
