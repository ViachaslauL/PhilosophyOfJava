package by.lepnikau.philosophy.of.java.chapter17.task16;

import by.lepnikau.philosophy.of.java.chapter17.example.map.maps.Maps;
import by.lepnikau.philosophy.of.java.chapter17.example.map.slow.SlowMap;
import by.lepnikau.philosophy.of.java.util.countries.Countries;

public class TaskSixteenTest {
    public static void main(String[] args) {
        SlowMap<Integer, String> slowMap = new SlowMap<>();
        slowMap.put(1, "value one");
        slowMap.put(2, "value two");
        slowMap.put(3, "value three");
        slowMap.put(4, "value four");
        slowMap.put(5, "value five");

        Maps.printKeys(slowMap);
    }
}
