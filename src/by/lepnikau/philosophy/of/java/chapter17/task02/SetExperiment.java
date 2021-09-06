package by.lepnikau.philosophy.of.java.chapter17.task02;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class SetExperiment {
    public static void main(String[] args) {

        Set<String> countries = new LinkedHashSet<>();
        String[][] data = Countries.DATA;
        Pattern pattern = Pattern.compile("^(A).+");


        for (String[] country : data) {
            if (pattern.matcher(country[0]).matches()) {
                countries.add(country[0]);
            }
        }

        for (String str: countries) {
            System.out.println(str);
        }
    }
}
