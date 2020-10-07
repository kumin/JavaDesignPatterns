package com.kumin.creational.abstractfactory;

public class RightLeg implements Leg {
    public static final String NAME = "right leg";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void kick() {

    }
}
