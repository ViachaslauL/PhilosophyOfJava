package by.lepnikau.philosophy.of.java.chapter17.task04;

import java.util.Arrays;
import java.util.List;

public class CollectionInitTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(CollectionInit.getTextFileData(
                "src/by/lepnikau/philosophy/of/java/chapter17/task04/someTextFile.txt"));

        for (String str: strings) {
            System.out.println(str);
        }
    }
}
