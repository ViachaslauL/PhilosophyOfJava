package by.lepnikau.philosophy.of.java.chapter15.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Fruit {
    void getDescription();
}

class Apple implements Fruit {
    @Override
    public void getDescription() {
        System.out.println("This is apple");
    }

    public void appleMethod() {
        System.out.println("Apple method");
    }
}

class RedPrince extends Apple {
    public void getDescription() {
        System.out.println("This is Red Prince");
    }
    public void redPrinceMethod() {
        System.out.println("Red Prince method");
    }
}

class Orange implements Fruit {
    @Override
    public void getDescription() {
        System.out.println("This is orange");
    }

    public void orangeMethod() {
        System.out.println("Orange method");
    }
}

public class TestClass {
    public static void main(String[] args) {

        List<? super RedPrince> fruits = new ArrayList<>(Arrays.asList(new Apple(), new Orange()));
        for (Object fruit: fruits) {
            System.out.println(fruit.getClass().getSimpleName());
        }
    }

    private static <T extends Fruit> void printDescription(T item) {
        item.getDescription();
    }
}
