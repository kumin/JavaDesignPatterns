package com.kumin.behaviral.observer;

public class EnergySavingCenter implements Observer {

    @Override
    public void update(Battery battery) {
        if (battery.LOW_BATTERY)
            System.out.println("Switching to save battery mode :)))");
    }
}
