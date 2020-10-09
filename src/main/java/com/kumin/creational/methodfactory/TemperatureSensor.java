package com.kumin.creational.methodfactory;

public class TemperatureSensor implements Sensor {
    @Override
    public String getFigure() {
        return "10 celsius";
    }
}
