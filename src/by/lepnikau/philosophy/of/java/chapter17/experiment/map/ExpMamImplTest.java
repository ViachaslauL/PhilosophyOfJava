package by.lepnikau.philosophy.of.java.chapter17.experiment.map;

import java.util.Set;

class ExpMamImplTest {
    public static void main(String[] args) {
        ExpMapImpl expMap = new ExpMapImpl();
        expMap.put("Key one", "Value one");
        expMap.put("Key two", "Value two");
        expMap.put("Key three", "Value three");
        expMap.put("Key four", "Value four");

        Set<ExpMap.ExpEntry<String, String>> expEntries = expMap.entrySet();
        for (ExpMap.ExpEntry<String, String> entry: expEntries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
