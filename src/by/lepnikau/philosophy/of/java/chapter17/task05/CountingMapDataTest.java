package by.lepnikau.philosophy.of.java.chapter17.task05;

import java.util.Map;
import java.util.Set;

class CountingMapDataTest {
    public static void main(String[] args) {
        CountingMapData countingMapData = new CountingMapData(20);
        Set<Map.Entry<Integer, String>> entries = countingMapData.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
