package by.lepnikau.philosophy.of.java.chapter15.example.generators;

import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Base;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.implement.ObjectGenerator;
import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Base> fill = fill(new ArrayList<>(), new ObjectGenerator(), 15);
        for (Base b : fill) {
            System.out.print(b.getClass().getSimpleName() + " ");
        }
    }
}
