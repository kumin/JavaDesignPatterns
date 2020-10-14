package com.kumin.structural.decorator;

import java.util.Date;

public interface UserInterface {
    default void post() {
        System.out.println("posting....");
    }

    default void comment() {
        System.out.println("commenting...");
    }

    default void reaction() {
        System.out.println("reacting...");
    }

    void doTasks();

    String getRole();



    default String joinDay() {
        return new Date().toString();
    }
}
