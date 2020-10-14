package com.kumin.structural.proxy;

public class RealImage implements ImageInterface {
    private String url;

    public RealImage(String url) {
        this.url = url;
    }

    @Override
    public String showImage() {
        System.out.println(url);
        return url;
    }
}
