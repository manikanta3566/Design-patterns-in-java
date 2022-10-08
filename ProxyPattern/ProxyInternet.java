package com.practice.proxyPattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    RealInternet realInternet = new RealInternet();
    static List<String> bannedSites;

    static {
        bannedSites = Arrays.asList("www.abc.com", "www.xyz.com");
    }

    @Override
    public void connectTo(String hostName) throws Exception {
        if (bannedSites.contains(hostName)) {
            throw new Exception("Access denied ! this site is banned");
        }
        realInternet.connectTo(hostName);
    }
}
