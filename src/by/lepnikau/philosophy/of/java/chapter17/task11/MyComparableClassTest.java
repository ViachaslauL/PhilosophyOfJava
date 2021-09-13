package by.lepnikau.philosophy.of.java.chapter17.task11;

import java.util.PriorityQueue;

public class MyComparableClassTest {
    public static void main(String[] args) {
        PriorityQueue<MyComparableClass> numbers = new PriorityQueue<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(new MyComparableClass());
        }

        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            System.out.printf("%s%s", numbers.poll(), (i + 1) % 10 == 0 ? "\n" : " ");
        }
    }
}
