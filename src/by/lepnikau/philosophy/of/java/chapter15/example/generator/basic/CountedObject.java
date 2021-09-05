package by.lepnikau.philosophy.of.java.chapter15.example.generator.basic;

public class CountedObject {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
