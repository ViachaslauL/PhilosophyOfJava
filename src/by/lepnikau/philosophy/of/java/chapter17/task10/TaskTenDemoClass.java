package by.lepnikau.philosophy.of.java.chapter17.task10;

import by.lepnikau.philosophy.of.java.util.generator.random.RandomGenerator;

import java.util.Arrays;

public class TaskTenDemoClass {
    public static void main(String[] args) {
        RandomGenerator.Integer integer = new RandomGenerator.Integer(5);
        Integer[] integers = new Integer[5];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = integer.next();
        }

        MySortedSet<Integer> mySortedSet = new MySortedSet<>(Arrays.asList(integers));

        System.out.println(mySortedSet.size());
    }
}
