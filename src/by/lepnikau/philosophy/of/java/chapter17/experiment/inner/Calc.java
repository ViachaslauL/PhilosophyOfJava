package by.lepnikau.philosophy.of.java.chapter17.experiment.inner;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.List;

public class Calc {
    public static void main(String[] args) {

        List<String> names = Countries.names();
        int i = 1;
        for (String name : names) {
            System.out.println(i++);
        }

    }
}
