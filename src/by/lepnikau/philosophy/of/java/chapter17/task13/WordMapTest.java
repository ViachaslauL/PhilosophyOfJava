package by.lepnikau.philosophy.of.java.chapter17.task13;

import by.lepnikau.philosophy.of.java.util.TextFile;

public class WordMapTest {
    public static void main(String[] args) {
        TextFile textFile = new TextFile(
                "src/by/lepnikau/philosophy/of/java/chapter17/task13/someTextFile.txt",
                "[,.!?]\\s|\\s");
        for (String str: textFile) {
            System.out.println("[" + str + "]");
        }
    }
}
