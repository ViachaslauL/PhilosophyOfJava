package by.lepnikau.philosophy.of.java.chapter13.task09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTaskNine {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        System.out.println(replaceVowels(knights));
    }

    private static String replaceVowels(String string) {
        Pattern pattern = Pattern.compile("[aeiuoy]");
        Matcher matcher = pattern.matcher(string);
        return matcher.replaceAll("_");
    }
}
