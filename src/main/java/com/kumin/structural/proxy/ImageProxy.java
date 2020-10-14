package com.kumin.structural.proxy;

public class ImageProxy implements ImageInterface {
    private String url;
    private ImageInterface realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public String showImage() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }

        return realImage.showImage();
    }
}
