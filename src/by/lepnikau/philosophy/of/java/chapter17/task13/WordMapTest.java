package by.lepnikau.philosophy.of.java.chapter17.task13;

import by.lepnikau.philosophy.of.java.util.TextFile;

public class WordMapTest {
    public static void main(String[] args) {
        TextFile textFile = new TextFile(
                "src/by/lepnikau/philosophy/of/java/chapter17/task13/someTextFile.txt",
                "[,.!?]\\s|\\s");

        WordsMap<String, Integer> wordsMap = new WordsMap<>();

        fillMap(textFile, wordsMap);

        for (String key : wordsMap.keySet()) {
            System.out.println(key + " : " + wordsMap.get(key));
        }

    }

    private static void fillMap(TextFile textFile, WordsMap<String, Integer> wordsMap) {
        for (String str : textFile) {
            if (!wordsMap.keySet().contains(str)) {
                int count = 0;
                for (String s : textFile) {
                    if (str.equals(s)) {
                        count++;
                    }
                }
                wordsMap.put(str, count);
            }
        }
    }
}
