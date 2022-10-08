package com.practice.proxyPattern;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String hostName) throws Exception {
        System.out.println("connecting to "+hostName);
    }
}
