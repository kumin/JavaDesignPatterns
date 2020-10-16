package com.kumin.behaviral.observer;

public interface Energy {
    void attach(Observer observer);

    void remove(Observer observer);

    void checkEnergy();

    void notifyStatus();
}
