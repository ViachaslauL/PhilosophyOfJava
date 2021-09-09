package by.lepnikau.philosophy.of.java.chapter17.experiment.map;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class ExpMapImpl implements ExpMap<String, String> {

    private int size;
    private Entry[] entries = new Entry[16];

    ExpMapImpl() {
    }

    ExpMapImpl(int size) {
        this.size = size;
    }

    @Override
    public void put(String k, String v) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = new Entry(k, v);
                break;
            }
        }
        size++;
    }

    @Override
    public Set<ExpMap.ExpEntry<String, String>> entrySet() {
        return new LinkedHashSet<>(Arrays.asList(entries).subList(0, size));
    }

    static class Entry implements ExpMap.ExpEntry<String, String> {
        private String key;
        private String val;

        public Entry(String k, String v) {
            key = k;
            val = v;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return val;
        }

        @Override
        public void setKey(String k) {
            key = k;
        }

        @Override
        public void setValue(String v) {
            val = v;
        }
    }
}
