package by.lepnikau.philosophy.of.java.chapter17.example.map.simplehash;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

public class SimpleHashMapTest {
    public static void main(String[] args) {
        SimpleHashMap<String, String> simpleHashMap =
                new SimpleHashMap<>();
        simpleHashMap.putAll(Countries.capitals(50));

        System.out.println(simpleHashMap);
    }
}
