package by.lepnikau.philosophy.of.java.chapter17.example.map.slow;

<<<<<<< HEAD
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
=======
import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.*;
>>>>>>> a8eded553c8f46b5b76ad3eeef3ca097b71d3984

public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

<<<<<<< HEAD
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
=======
    public V put(K key, V val) {
        V oldVal = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(val);
        } else {
            values.set(keys.indexOf(key), val);
        }
        return oldVal;
    }

    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        Iterator<K> kIter = keys.iterator();
        Iterator<V> vIter = values.iterator();
        while (kIter.hasNext()) {
            set.add(new MapEntry<>(kIter.next(), vIter.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> slowMap = new SlowMap<>();
        slowMap.putAll(Countries.capitals(15));
        System.out.println(slowMap);
        System.out.println(slowMap.get("ANGOLA"));
        System.out.println(slowMap.entrySet());
>>>>>>> a8eded553c8f46b5b76ad3eeef3ca097b71d3984
    }
}
