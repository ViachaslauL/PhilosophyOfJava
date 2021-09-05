package by.lepnikau.philosophy.of.java.chapter15.example.test;

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
        System.out.println("This is Red Prince apple");
    }

    public void redPrinceMethod() {
        System.out.println("Red prince method");
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

class Box {
    private final List<? extends Fruit> fruits;

    public Box(List<? extends Fruit> fruits) {
        this.fruits = fruits;
    }

    public void printFruitsDescription() {
        for (Fruit fruit : fruits) {
            fruit.getDescription();
        }
    }
}

public class TestClass {
    public static void main(String[] args) {

        Box box = new Box(Arrays.asList(new Apple(), new Orange(), new RedPrince()));
        box.printFruitsDescription();
    }
}
