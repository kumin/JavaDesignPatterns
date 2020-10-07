package com.kumin.creational.abstractfactory;

import com.kumin.Constants;

public class Client {
    public static void main(String[] args) {
        LimbAbstractFactory limbFactory = new LimbsFactory().getLimb(Constants.Directions.Left.name());
        System.out.println(limbFactory.getArm().getName());
        System.out.println(limbFactory.getLeg().getName());
    }
}
