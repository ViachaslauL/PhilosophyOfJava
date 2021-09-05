package by.lepnikau.philosophy.of.java.chapter15.example.generator.basic;

import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;

public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> BasicGenerator<T> create(Class<T> tClass) {
        return new BasicGenerator<>(tClass);
    }
}
