package com.kumin.structural.decorator;

public class Client {
    public static void main(String[] args) {
        UserInterface user = new UserConcrete();
        UserInterface moderator = new Moderator(user);
        UserInterface adminAndModerator = new Admin(moderator);

        adminAndModerator.doTasks();
        System.out.println(adminAndModerator.getRole());
    }
}
