package com.practice.proxyPattern;

public class ProxyDemo {
    public static void main(String[] args) {
        Internet internet=new ProxyInternet();
        try {
            internet.connectTo("www.learn.com");
            internet.connectTo("www.abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
