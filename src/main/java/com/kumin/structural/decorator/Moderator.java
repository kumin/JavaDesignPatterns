package com.kumin.structural.decorator;

public class Moderator extends UserDecorator {

    public Moderator(UserInterface user) {
        super(user);
    }

    public void doTasks() {
        user.doTasks();
        validComment();
        validPost();
    }

    @Override
    public String getRole() {
        return "Moderator," + user.getRole();
    }

    public void validPost() {
        System.out.println("this post is valid");
    }

    public void validComment() {
        System.out.println("this comment is invalid");
    }
}
