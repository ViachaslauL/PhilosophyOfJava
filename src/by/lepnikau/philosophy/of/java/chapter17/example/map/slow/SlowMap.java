package by.lepnikau.philosophy.of.java.chapter17.example.map.slow;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

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
    }
}
