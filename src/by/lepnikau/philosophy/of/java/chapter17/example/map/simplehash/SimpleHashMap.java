package by.lepnikau.philosophy.of.java.chapter17.example.map.simplehash;

import by.lepnikau.philosophy.of.java.chapter17.example.map.slow.MapEntry;

import java.util.*;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    private static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    private LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    public V put(K key, V val) {
        V oldVal = null;
        boolean found = false;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<>(key, val);

        ListIterator<MapEntry<K, V>> it = bucket.listIterator();

        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldVal = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldVal;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> next : bucket) {
            if (next.getKey().equals(key)) {
                return next.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            set.addAll(bucket);
        }
        return set;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<MapEntry<K, V>> list : buckets) {
            if (list != null)
                sb.append(list).append("\n");
        }
        return sb.toString();
    }
}
