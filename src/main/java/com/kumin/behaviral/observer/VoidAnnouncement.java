package com.kumin.behaviral.observer;

public class VoidAnnouncement implements Observer {
    @Override
    public void update(Battery battery) {
        if (battery.LOW_BATTERY)
            System.out.println("Let kumin know about low battery");
    }
}
