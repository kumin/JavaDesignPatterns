package com.kumin.structural.decorator;

public class Admin extends UserDecorator {
    public Admin(UserInterface user) {
        super(user);
    }

    @Override
    public void doTasks() {
        user.doTasks();
        assignRole();
        banMember();
    }

    @Override
    public String getRole() {
        return "Administrator," + user.getRole();
    }

    public void assignRole() {
        System.out.println("you're gonna become like me");
    }

    public void banMember() {
        System.out.println("go to the hell");
    }
}
