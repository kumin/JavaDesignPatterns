package com.kumin.structural.decorator;

public abstract class UserDecorator implements UserInterface {
    public UserInterface user;

    public UserDecorator(UserInterface user) {
        this.user = user;
    }

    @Override
    public void doTasks() {
        user.doTasks();
    }

    @Override
    public String getRole() {
        return user.getRole();
    }
}
