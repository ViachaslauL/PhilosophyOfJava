package by.lepnikau.philosophy.of.java.chapter17.task20;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

public class TaskTwentyDemoClass {
    public static void main(String[] args) {
        SimpleHashMap<String, String> map = new SimpleHashMap<>();
        map.putAll(Countries.capitals(10));
        System.out.println(map.toString());


        map.putAll(Countries.capitals());
        System.out.println(map.toString());
        System.out.println(map.printCollision());
    }
}
