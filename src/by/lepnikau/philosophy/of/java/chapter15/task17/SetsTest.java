package by.lepnikau.philosophy.of.java.chapter15.task17;

import by.lepnikau.philosophy.of.java.chapter15.example.generics.watercolors.Watercolors;
import by.lepnikau.philosophy.of.java.chapter15.example.generics.watercolors.Watercolors.*;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import static by.lepnikau.philosophy.of.java.chapter15.example.generics.watercolors.Watercolors.*;

public class SetsTest {
    public static void main(String[] args) {

        EnumSet<Watercolors> range = EnumSet.range(ZINC, IVORY_BLACK);
        EnumSet<Watercolors> clone = range.clone();

        for (Watercolors w: clone) {
            System.out.println(w.toString());
        }
    }

    public  <T> Set<T> cloneSet(Set<T> set) {
        Set<T> clone;
        try {
            clone = (Set<T>) super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }

        return clone;
    }
}
