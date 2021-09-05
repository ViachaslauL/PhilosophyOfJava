package by.lepnikau.philosophy.of.java.chapter15.example.generator.basic;

import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.Base;
import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.clazz.First;

public class BasicGeneratorTest {
    public static void main(String[] args) {

        BasicGenerator<CountedObject> generator = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }

    }
}
