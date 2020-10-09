package com.kumin.creational.builder;

public class Client {
    public static void main(String[] args) {
        RobotFace face = new RobotFace.RobotFaceBuilder()
                .setEyeColor("green")
                .setEyeSize("Big")
                .setHairColor("purple")
                .setHairType("mullet")
                .build();

        System.out.println(face);

    }
}
