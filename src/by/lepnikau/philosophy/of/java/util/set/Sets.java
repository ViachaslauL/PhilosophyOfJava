package by.lepnikau.philosophy.of.java.util.set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
        Set<T> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
        Set<T> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
