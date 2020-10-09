package com.kumin.creational.methodfactory;

import com.kumin.Constants;

public class SensorFactory {
    public Sensor getSensor(Constants.Sensor sensorType) {
        switch (sensorType) {
            case Obstacle:
                return new ObstacleSensor();
            case Temperature:
                return new TemperatureSensor();

            default:
                throw new RuntimeException("What the hell was that?");
        }
    }
}
