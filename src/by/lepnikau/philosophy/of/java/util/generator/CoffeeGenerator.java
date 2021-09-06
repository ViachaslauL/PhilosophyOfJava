package by.lepnikau.philosophy.of.java.util.generator;

import by.lepnikau.philosophy.of.java.util.generator.coffee.*;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator<T>
        implements Generator<T>, Iterable<T> {
    private Class[] types = {Breve.class, Americano.class, Cappuccino.class,
            Latte.class, Mocha.class};
    private static Random random = new Random();
    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public T next() {
        try {
            return (T) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<T> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public T next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() { // Не реализован
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator<Coffee> gen = new CoffeeGenerator<>();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());

        for (Coffee c: new CoffeeGenerator<Coffee>(5)) {
            System.out.println(c);
        }

    }
}
