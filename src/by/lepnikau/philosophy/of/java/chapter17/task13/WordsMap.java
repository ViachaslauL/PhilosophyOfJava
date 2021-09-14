package by.lepnikau.philosophy.of.java.chapter17.task13;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class WordsMap<K, V> {
    private Object[][] pairs = new Object[16][2];
    private int index;
    private static final float EXP_C = 1.5f;

    public WordsMap() {
    }

    public WordsMap(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V val) {
        if (index >= pairs.length) {
            expandArray();
        }
        pairs[index++] = new Object[]{key, val};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (Object[] pair : pairs)
            if (pair[0].equals(key))
                return (V) pair[1];
        return null;
    }

    @SuppressWarnings("unchecked")
    public Set<K> keySet() {
        Object[] keysArray = new Object[index];
        for (int i = 0; i < index; i++) {
            keysArray[i] = pairs[i][0];
        }
        return new HashSet<>((Collection<? extends K>) Arrays.asList(keysArray));
    }

    public int size() {
        return index + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object[] pair : pairs) {
            sb.append(pair[0].toString());
            sb.append(" : ");
            sb.append(pair[1].toString()).append("\n");
        }
        return sb.toString();
    }

    private void expandArray() {
        pairs = Arrays.copyOf(pairs, (int) (pairs.length * EXP_C));
    }
}
