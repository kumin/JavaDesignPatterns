package com.kumin.behaviral.iterator;

import java.util.List;

public class CompleteBTree implements Tree {
    private List<Integer> nodes;

    public CompleteBTree(List<Integer> nodes) {
        this.nodes = nodes;
    }

    @Override
    public TreeIterator<Integer> getIterator() {
        return new CompleteTreeIterator();
    }

    private class CompleteTreeIterator implements TreeIterator<Integer> {
        private int index = 0;

        @Override
        public Integer next() {
            return nodes.get(++index);
        }

        @Override
        public boolean hasNext() {
            return index + 1 < nodes.size();
        }
    }
}
