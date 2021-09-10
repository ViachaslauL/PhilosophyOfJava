package by.lepnikau.philosophy.of.java.chapter17.task09;

import by.lepnikau.philosophy.of.java.util.generator.random.RandomGenerator;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class TaskNineDemoClass {
    public static void main(String[] args) {
        RandomGenerator.String string = new RandomGenerator.String(5);
        TreeSet<String> strings = new TreeSet<>(new StringComparator());
        for (int i = 0; i < 15; i++) {
            strings.add(string.next());
        }

        System.out.println(strings);
    }
}
