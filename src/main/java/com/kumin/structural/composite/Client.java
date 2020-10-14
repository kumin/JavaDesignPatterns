package com.kumin.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileInterface file1 = new File("file1", "hello");
        FileInterface file2 = new File("file2", "beautiful");
        FileInterface file3 = new File("file3", "girls");
        List<FileInterface> files = new ArrayList<>();
        files.add(file1);
        files.add(file2);
        files.add(file3);
        FileInterface directory = new Directory("baby", files);

        directory.getProps();
    }
}
