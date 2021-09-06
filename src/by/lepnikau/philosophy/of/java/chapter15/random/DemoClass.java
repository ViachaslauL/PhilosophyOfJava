package by.lepnikau.philosophy.of.java.chapter15.random;

import by.lepnikau.philosophy.of.java.chapter15.random.list.RandomList;

public class DemoClass {
    public static void main(String[] args) {

        RandomList<String> randomList = new RandomList<>();

        for (String str: "The quick brown fox jumped over the lazy brown dog".split(" ")) {
            randomList.add(str);
        }

        for (String str: randomList) {
            System.out.print(str + " ");
        }

    }
}
