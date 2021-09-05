package by.lepnikau.philosophy.of.java.chapter11.basicConcepts.task02;

import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> collection = new LinkedHashSet<>();
        for(int i = 0; i < 10; i++) {
            collection.add(i); // Автоматическая упаковка
        }
        for(Integer i : collection) {
            System.out.print(i + ", ");
        }
    }
}
