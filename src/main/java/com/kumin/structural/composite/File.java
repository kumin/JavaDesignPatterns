package com.kumin.structural.composite;

public class File implements FileInterface {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getProps() {
        return name + ":" + content;
    }

    @Override
    public int getSize() {
        return 100;
    }
}
