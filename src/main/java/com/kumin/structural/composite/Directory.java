package com.kumin.structural.composite;

import java.util.List;

public class Directory implements FileInterface {
    private String name;
    private List<FileInterface> children;

    public Directory(String name, List<FileInterface> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public String getProps() {
        children.forEach(file -> System.out.println(file.getProps()));
        return name;
    }

    @Override
    public int getSize() {
        return 1000;
    }
}
