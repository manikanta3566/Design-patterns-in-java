package com.practice.observerpattern;

public class ObserverDemo {
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay=new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay=new CurrentScoreDisplay();
        CricketData cricketData=new CricketData();
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.dataChanged();
       cricketData.unregisterObserver(currentScoreDisplay);
        cricketData.dataChanged();

    }
}
