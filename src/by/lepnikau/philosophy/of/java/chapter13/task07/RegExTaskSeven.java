package by.lepnikau.philosophy.of.java.chapter13.task07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTaskSeven {
    public static void main(String[] args) {
        String str = "Evening is full of the linnet's wings.";

        System.out.println(checkString(str));
    }

    private static boolean checkString(String string) {
        Pattern pattern = Pattern.compile("^[A-Z].+\\.$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
