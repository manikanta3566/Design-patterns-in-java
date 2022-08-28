package com.practice.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;
    private List<Observer> observers;

    public CricketData() {
        this.observers = new ArrayList<>();
    }

    private int getLatestRuns() {
        // return 90 for simplicity
        return 90;
    }

    private int getLatestWickets() {
        // return 2 for simplicity
        return 2;
    }

    private float getLatestOvers() {
        // return 90 for simplicity
        return 10.2f;
    }

    public void dataChanged() {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(observers.indexOf(o));

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(runs, wickets, overs);
        }
    }
}
