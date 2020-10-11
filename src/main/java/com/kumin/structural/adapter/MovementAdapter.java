package com.kumin.structural.adapter;

public class MovementAdapter implements MovementInterface {
    private WheelAdaptee wheelAdaptee;

    public MovementAdapter(WheelAdaptee wheel) {
        this.wheelAdaptee = wheel;
    }

    @Override
    public void Move() {
        wheelAdaptee.roll();
    }
}
