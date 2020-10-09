package com.kumin.creational.methodfactory;

import com.kumin.Constants;

public class Client {
    public static void main(String[] args) {
        Sensor sensor = new SensorFactory().getSensor(Constants.Sensor.Temperature);
        System.out.println(sensor.getFigure());
    }
}
