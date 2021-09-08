package by.lepnikau.philosophy.of.java.chapter17.experiment;

import java.util.Set;

interface ExpMap<K, V> {

    void put(K key, V val);

    Set<ExpMap.ExpEntry<K, V>> entrySet();

    interface ExpEntry<K, V> {
        K getKey();

        V getValue();

        void setKey(K key);

        void setValue(V val);
    }
}
