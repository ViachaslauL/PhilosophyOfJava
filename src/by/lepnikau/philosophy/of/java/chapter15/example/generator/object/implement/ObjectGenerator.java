package by.lepnikau.philosophy.of.java.chapter15.example.generator.object.implement;

import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Base;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.First;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Second;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Third;

import java.util.Iterator;
import java.util.Random;

public class ObjectGenerator implements Generator<Base>, Iterable<Base> {

    private Class[] types = {
            First.class, Second.class, Third.class
    };
    private Random random = new Random();
    private int size = 0;

    public ObjectGenerator() {
    }

    public ObjectGenerator(int size) {
        this.size = size;
    }

    @Override
    public Base next() {
        try {
            return (Base) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class ObjectGeneratorIterator implements Iterator<Base> {

        private int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Base next() {
            count--;
            return ObjectGenerator.this.next();
        }
    }

    @Override
    public Iterator<Base> iterator() {
        return new ObjectGeneratorIterator();
    }
}
