package by.lepnikau.philosophy.of.java.chapter17.task03;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class TaskThreeSetExperiment {
    private static Pattern pattern = Pattern.compile("^(A).+");

    public static void main(String[] args) {
        String[][] data = Countries.DATA;
        Set<String> set = new LinkedHashSet<>();

        addIntoSet(data, set);
        addIntoSet(data, set);

        printSet(set);
    }

    private static void printSet(Set<String> set) {
        for (String country: set) {
            System.out.println(country);
        }
    }

    private static void addIntoSet(String[][] data, Set<String> set) {
        for (String[] country: data) {
            if (pattern.matcher(country[0]).matches()) {
                set.add(country[0]);
            }
        }
    }
}
