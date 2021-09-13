package by.lepnikau.philosophy.of.java.chapter17.task11;

import java.util.Random;

class MyComparableClass implements Comparable<MyComparableClass>{
    private Integer number;

    public MyComparableClass() {
        number = new Random().nextInt(101);
    }

    @Override
    public int compareTo(MyComparableClass arg) {
        return number.compareTo(arg.number);
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
