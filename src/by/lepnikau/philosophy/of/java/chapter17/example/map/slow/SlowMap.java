package by.lepnikau.philosophy.of.java.chapter17.example.map.slow;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
