package by.lepnikau.philosophy.of.java.chapter17.task05;

import java.util.*;

class CountingMapData extends AbstractMap<Integer, String> {
    private int size;
    private static String[] chars =
            "А В С D E F G H I 3 К L M N 0 P Q R S T U V W X Y Z"
                    .split(" ");

    public CountingMapData(int size) {
        this.size = Math.max(size, 0);
    }

    private static class Entry implements Map.Entry<Integer, String> {
        int index;

        public Entry(int index) {
            this.index = index;
        }

        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            return chars[index % chars.length] + index / chars.length;
        }

        @Override
        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return Integer.valueOf(index).equals(obj);
        }
    }

    static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
        private int size;

        EntrySet(int size) {
            this.size = size;
        }

        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        LinkedHashSet<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            entries.add(new Entry(i));
        }
        return entries;
    }
}
