package com.kumin.structural.proxy;

public class Client {
    public static void main(String[] args) {
        ImageInterface img = new ImageProxy("url:image");
        img.showImage();
    }
}
