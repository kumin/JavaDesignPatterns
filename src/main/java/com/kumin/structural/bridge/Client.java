package com.kumin.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Project webJava = new Website(new Java());
        webJava.code();
        Project appPython = new MobilApp(new Python());
        appPython.code();
    }
}
