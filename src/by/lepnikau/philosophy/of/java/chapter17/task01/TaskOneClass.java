package by.lepnikau.philosophy.of.java.chapter17.task01;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskOneClass {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        String[][] data = Countries.DATA;

        for (int i = 0; i < data.length; i++) {
            countries.add(data[i][0]);
        }
        Collections.sort(countries);
        //printCountries(countries);

        Collections.shuffle(countries);
        printCountries(countries);
    }

    private static void printCountries(List<String> countries) {
        for (int i = 1; i < countries.size(); i++) {
            System.out.printf("[%s]%s",countries.get(i - 1), i % 5 == 0 ? "\n" : " ");
        }
    }
}
