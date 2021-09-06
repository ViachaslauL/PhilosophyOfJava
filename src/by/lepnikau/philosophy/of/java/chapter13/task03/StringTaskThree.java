package by.lepnikau.philosophy.of.java.chapter13.task03;

import java.io.PrintStream;
import java.util.Formatter;

class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The Turtle is at (%d, %d)\n",name, x, y);
    }
}

public class StringTaskThree {
    public static void main(String[] args) {
        PrintStream one = System.err;
        PrintStream two = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(one));
        Turtle terry = new Turtle("Terry", new Formatter(two));
        tommy.move(0, 1);
        terry.move(1, 2);
        tommy.move(3, 5);
        terry.move(4, 7);
        tommy.move(5, 8);
        terry.move(7, 9);
    }
}
