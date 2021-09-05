package by.lepnikau.philosophy.of.java.chapter13.task13;

import by.lepnikau.philosophy.of.java.chapter13.Groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.lepnikau.philosophy.of.java.util.PrintLN.print;

public class StartEnd {
    public static String input = Groups.POEM;

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() " + m.group() + " start = " + m.start() + " end = " + m.end());
        if (m.lookingAt()) // Вызов reset() не нужен
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        if (m.matches()) // Вызов reset() не нужен
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            print("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}
