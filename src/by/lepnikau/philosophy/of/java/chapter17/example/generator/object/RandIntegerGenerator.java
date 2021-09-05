package by.lepnikau.philosophy.of.java.chapter17.example.generator.object;

import by.lepnikau.philosophy.of.java.util.mapdata.Generator;

import java.util.Random;

public class RandIntegerGenerator implements Generator<Integer> {
    private final Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final Random random = new Random();

    @Override
    public Integer next() {
        return integers[random.nextInt(10)];
    }
}
