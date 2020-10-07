package com.kumin.creational.abstractfactory;

public class LeftLeg implements Leg {
    public static final String NAME = "left leg";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void kick() {

    }
}
