package by.lepnikau.philosophy.of.java.chapter14.task12.coffee;

import by.lepnikau.philosophy.of.java.chapter14.task12.Generator;
import by.lepnikau.philosophy.of.java.util.TypeCounter;

import java.util.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {
            Latte.class,
            Mocha.class,
            Cappuccino.class,
            Americano.class,
            Breve.class,
    };
    private static Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    // For iteration:
    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    ;

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        //CoffeeGenerator gen = new CoffeeGenerator();
        /*for (int i = 0; i < 5; i++)
            System.out.println(gen.next());*/
        /*for (Coffee c : new CoffeeGenerator(5))
            System.out.println(c);*/

        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Coffee coffee: new CoffeeGenerator(6)) {
            counter.count(coffee);
        }
        System.out.println(counter.toString());

    }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
