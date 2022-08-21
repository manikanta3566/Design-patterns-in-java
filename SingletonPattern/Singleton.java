package com.practice.singletonpattern;

public class Singleton {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
        MyClass myClass = MyClass.getInstance();
        System.out.println(myClass);
        Test test1=new Test();
        System.out.println(test1);
        MyClass myClass1=MyClass.getInstance();
        System.out.println(myClass1);

    }
}
