package com.kumin.creational.abstractfactory;

import com.kumin.Constants;

public class LimbsFactory {
    public LimbAbstractFactory getLimb(String direction) {

        Constants.Directions switchDirection = Constants.Directions.valueOf(direction);

        switch (switchDirection) {
            case Left:
                return new LeftLimbFactory();
            case Right:
                return new RightLimbFactory();
            default:
                throw  new RuntimeException("What the f*** is that?");

        }
    }
}
