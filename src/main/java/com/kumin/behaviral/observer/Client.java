package com.kumin.behaviral.observer;

public class Client {
    public static void main(String[] args) {
        Energy battery = new Battery();
        battery.attach(new EnergySavingCenter());
        battery.attach(new VoidAnnouncement());
        battery.checkEnergy();
    }
}
