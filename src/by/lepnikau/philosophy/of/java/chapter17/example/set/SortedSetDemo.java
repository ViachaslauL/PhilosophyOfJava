package by.lepnikau.philosophy.of.java.chapter17.example.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import static  by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight nine".split(" "));
        print(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        print(low);
        print(high);
        Iterator<String> iterator = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = iterator.next();
            if (i == 6) high = iterator.next();
            else iterator.next();
        }
        print(low);
        print(high);
        print(sortedSet.subSet(low, high));
        print(sortedSet.headSet(high));
        print(sortedSet.tailSet(low));
    }
}
