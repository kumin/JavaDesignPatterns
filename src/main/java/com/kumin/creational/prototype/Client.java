package com.kumin.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ActionPrototype eyesAction1 = new EyesActionPrototype("wink");
        ActionPrototype eyesAction2 = eyesAction1.clone();
        eyesAction2.setActionName("glanced");
        System.out.println(eyesAction1.hashCode()+":"+eyesAction1.getActionName());
        System.out.println(eyesAction2.hashCode()+":"+eyesAction2.getActionName());
    }
}
