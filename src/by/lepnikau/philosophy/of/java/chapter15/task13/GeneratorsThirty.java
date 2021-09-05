package by.lepnikau.philosophy.of.java.chapter15.task13;

import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Base;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.implement.ObjectGenerator;
import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;

import java.util.*;

public class GeneratorsThirty {

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {

        for (Base b : fill(new Stack<>(), new ObjectGenerator(), 15)) {
            System.out.print(b.getClass().getSimpleName() + " ");
        }

    }
}
