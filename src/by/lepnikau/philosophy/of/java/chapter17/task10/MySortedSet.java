package by.lepnikau.philosophy.of.java.chapter17.task10;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class MySortedSet<E> extends LinkedList<E> {

    private Object[] data = new Object[10];
    private int size;
    private static final float EXP_COEFFICIENT = 1.5f;

    public MySortedSet() {
    }

    public MySortedSet(Collection<E> col) {
        Object[] obj = col.toArray();
        expandData(col);
        System.arraycopy(obj, 0, data, size, obj.length);
        size = size + obj.length;
    }

    public int size() {
        return size;
    }

    private void expandData(Collection<E> col) {
        if (size + col.size() > data.length) {
            data = Arrays.copyOf(this.data,
                    (int) ((data.length + col.size()) * EXP_COEFFICIENT));
        }
    }
}
