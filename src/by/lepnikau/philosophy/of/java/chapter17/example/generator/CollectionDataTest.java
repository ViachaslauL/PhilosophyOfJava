package by.lepnikau.philosophy.of.java.chapter17.example.generator;

import by.lepnikau.philosophy.of.java.chapter17.example.generator.object.RandIntegerGenerator;
import by.lepnikau.philosophy.of.java.chapter17.example.generator.collection.CollectionData;
import by.lepnikau.philosophy.of.java.chapter17.example.generator.object.RandStringGenerator;

public class CollectionDataTest {
    public static void main(String[] args) {


        CollectionData<Integer> coll = new CollectionData<>(new RandIntegerGenerator(), 10);
        for (Integer integer : coll) {
            System.out.print(integer + " ");
        }
        System.out.println();
        CollectionData<String> collStr = new CollectionData<>(new RandStringGenerator(), 20);
        for (String str : collStr) {
            System.out.print(str + " ");
        }
    }
}
