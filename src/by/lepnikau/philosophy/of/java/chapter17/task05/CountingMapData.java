package by.lepnikau.philosophy.of.java.chapter17.task05;

import java.util.*;

class CountingMapData extends AbstractMap<Integer, String> {
    private int size;
    private static final String[] CHARS =
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
            return CHARS[index % CHARS.length] + index / CHARS.length;
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

    private static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
        private int size;
        private int index;
        private Entry[] entries = new Entry[16];
        private static final float EXPAND_COEFFICIENT = 1.5f;

        EntrySet(int size) {
            this.size = size;
            if (size > entries.length) {
                expandEntries();
            }
        }

        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new Iterator<Map.Entry<Integer, String>>() {

                @Override
                public boolean hasNext() {
                    return index < size;
                }

                @Override
                public Map.Entry<Integer, String> next() {
                    return entries[index++];
                }
            };
        }

        @Override
        public int size() {
            return size;
        }

        public void add(Entry entry) {
            for (int i = 0; i < entries.length; i++) {
                if (entries[i] == null) {
                    entries[i] = entry;
                    break;
                }
            }
        }

        private void expandEntries() {
            Entry[] tempEntries =
                    new Entry[(int) (entries.length * EXPAND_COEFFICIENT)];
            System.arraycopy(entries, 0, tempEntries, 0, entries.length);
            entries = tempEntries;
        }
    }

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        EntrySet entries = new EntrySet(size);
        for (int i = 0; i < size; i++) {
            entries.add(new Entry(i));
        }
        return entries;
    }
}
