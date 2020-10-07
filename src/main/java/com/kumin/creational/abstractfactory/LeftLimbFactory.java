package com.kumin.creational.abstractfactory;

public class LeftLimbFactory extends LimbAbstractFactory {
    @Override
    public Arm getArm() {
        return new LeftArm();
    }

    @Override
    public Leg getLeg() {
        return new LeftLeg();
    }
}
