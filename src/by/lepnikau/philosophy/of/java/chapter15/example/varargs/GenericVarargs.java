package by.lepnikau.philosophy.of.java.chapter15.example.varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {
        return new ArrayList<>(Arrays.asList(args));
    }

    public static void main(String[] args) {
        List<String> strings = makeList("A");
        System.out.println(strings);
        strings = makeList("A", "B", "C");
        System.out.println(strings);
        strings = makeList("ABCDEFGHIKLMNOPQRSTVXYZ".split(""));
        System.out.println(strings);
    }
}
