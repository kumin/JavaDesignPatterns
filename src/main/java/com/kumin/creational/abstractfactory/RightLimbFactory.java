package com.kumin.creational.abstractfactory;

public class RightLimbFactory extends LimbAbstractFactory {
    @Override
    public Arm getArm() {
        return new RightArm();
    }

    @Override
    public Leg getLeg() {
        return new RightLeg();
    }
}
