package by.lepnikau.philosophy.of.java.chapter17.example.abstr.list;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer> {
    private int size;

    public CountingIntegerList(int size) {
        this.size = Math.max(size, 0);
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }
}
