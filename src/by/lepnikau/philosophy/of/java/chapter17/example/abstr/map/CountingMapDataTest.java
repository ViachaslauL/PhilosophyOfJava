package by.lepnikau.philosophy.of.java.chapter17.example.abstr.map;

import java.util.Map;
import java.util.Set;

public class CountingMapDataTest {
    public static void main(String[] args) {
        CountingMapData countingMapData = new CountingMapData(60);
        Set<Map.Entry<Integer, String>> entries = countingMapData.entrySet();

        printEntrySet(entries);
    }

    private static void printEntrySet(Set<Map.Entry<Integer, String>> entries) {
        int i = 1;
        for (Map.Entry<Integer, String> entry : entries) {
            String result = "";
            if (i % 10 == 0) {
                result += entry.getKey() + "=" + entry.getValue() + "\n";
            } else {
                result += entry.getKey() + "=" + entry.getValue() + " ";
            }
            System.out.print(result);
            i++;
        }
    }
}
