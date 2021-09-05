package by.lepnikau.philosophy.of.java.chapter17.example.generator.object;

import by.lepnikau.philosophy.of.java.util.mapdata.Generator;

import java.util.Random;

public class RandStringGenerator implements Generator<String> {
    private String[] foundation = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" ");
    private Random random = new Random();

    @Override
    public String next() {
        return foundation[random.nextInt(foundation.length)];
    }
}
