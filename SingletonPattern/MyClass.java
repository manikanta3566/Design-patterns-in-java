package com.practice.singletonpattern;

import java.util.Objects;

public class MyClass {

    //eagerly creating the object
    private static MyClass instance=new MyClass();
    private MyClass(){
        System.out.println("Myclass object created");
    }
    public static MyClass getInstance(){
        return instance;
    }
}
