package com.kumin.behaviral.observer;

import java.util.ArrayList;
import java.util.List;

public class Battery implements Energy {
    public boolean LOW_BATTERY = true;
    private List<Observer> observers;

    public Battery() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void checkEnergy() {
        if (LOW_BATTERY)
            notifyStatus();
    }

    @Override
    public void notifyStatus() {
        observers.forEach(observer -> {
            observer.update(this);
        });
    }
}
