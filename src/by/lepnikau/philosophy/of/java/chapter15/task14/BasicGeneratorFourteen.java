package by.lepnikau.philosophy.of.java.chapter15.task14;

import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;

public class BasicGeneratorFourteen<T> implements Generator<T> {

    private Class<T> type;

    public BasicGeneratorFourteen(Class<T> type) {
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

    public static <T> BasicGeneratorFourteen<T> create(Class<T> tClass) {
        return new BasicGeneratorFourteen<>(tClass);
    }
}
