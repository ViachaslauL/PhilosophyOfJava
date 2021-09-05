package by.lepnikau.philosophy.of.java.chapter15.example.generator.object;

import by.lepnikau.philosophy.of.java.chapter15.example.generator.object.implement.ObjectGenerator;

public class GeneratorTest {
    public static void main(String[] args) {

        ObjectGenerator generator = new ObjectGenerator();

        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next().getClass().getSimpleName());
        }

        /*for (Base base: new ObjectGenerator(10)) {
            System.out.println(base.getClass().getSimpleName());
        }*/

    }
}
