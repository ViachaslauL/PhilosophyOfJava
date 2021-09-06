package by.lepnikau.philosophy.of.java.chapter17.example.abstr.set;

import java.util.AbstractSet;
import java.util.Iterator;

public class CountingIntegerSet extends AbstractSet<Integer> {
    private int size;

    public CountingIntegerSet(int size) {
        this.size = Math.max(size, 0);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Integer next() {
                return index++;
            }
        };
    }

    @Override
    public int size() {
        return size;
    }
}
