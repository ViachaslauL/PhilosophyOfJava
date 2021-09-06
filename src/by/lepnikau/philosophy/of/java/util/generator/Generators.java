package by.lepnikau.philosophy.of.java.util.generator;

import by.lepnikau.philosophy.of.java.util.generator.coffee.Coffee;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Generators generators = new Generators();
        Collection<Coffee> collection = generators.fill(new ArrayList<>(),
                new CoffeeGenerator<>(), 5);
        for (Coffee c: collection) {
            System.out.println(c);
        }
    }
}
