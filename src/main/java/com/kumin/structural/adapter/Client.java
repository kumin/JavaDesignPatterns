package com.kumin.structural.adapter;

public class Client {
    public static void main(String[] args) {
        MovementInterface movement = new MovementAdapter(new WheelAdaptee());
        movement.Move();
    }
}
