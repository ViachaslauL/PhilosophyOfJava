package by.lepnikau.philosophy.of.java.chapter17.example.collectiondatatest;

import by.lepnikau.philosophy.of.java.chapter17.example.collectiondatatest.government.Government;
import by.lepnikau.philosophy.of.java.util.collectiondata.CollectionData;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<>(new Government(), 14));
        set.addAll(CollectionData.list(new Government(), 14));
        System.out.println(set);
    }
}
