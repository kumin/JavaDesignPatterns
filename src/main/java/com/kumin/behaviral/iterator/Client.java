package com.kumin.behaviral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Client {
    public static void main(String[] args) {
        List<Integer> nodes = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            nodes.add(ThreadLocalRandom.current().nextInt(1, 100));
        }
        Tree bTree = new CompleteBTree(nodes);
        TreeIterator iterator = bTree.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
