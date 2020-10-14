package com.kumin.structural.decorator;

public class User extends UserDecorator {
    public User(UserInterface user) {
        super(user);
    }

    @Override
    public void doTasks() {
        user.doTasks();
        report();
    }

    @Override
    public String getRole() {
        return "Normal member," + user.getRole();
    }

    public void report() {
        System.out.println("This is a porn");
    }
}
