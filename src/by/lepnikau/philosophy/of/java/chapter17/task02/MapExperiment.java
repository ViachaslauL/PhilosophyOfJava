package by.lepnikau.philosophy.of.java.chapter17.task02;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class MapExperiment {
    public static void main(String[] args) {

        Map<String, String> countries = new LinkedHashMap<>();
        String[][] countriesArr = Countries.DATA;
        Pattern pattern = Pattern.compile("^(A).+");

        for (String[] strings : countriesArr) {
            if (pattern.matcher(strings[0]).matches()) {
                countries.put(strings[0], strings[1]);
            }
        }

        Set<Map.Entry<String, String>> entries = countries.entrySet();
        for (Map.Entry<String, String> country: entries) {
            System.out.println(country.toString());
        }
    }
}
