package by.lepnikau.philosophy.of.java.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class Finding {
    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings.");
        while (matcher.find()) {
            printnb(matcher.group() + " ");
        }
        print();
        int i = 0;
        while (matcher.find(i)) {
            printnb(matcher.group() + " ");
            i++;
        }

    }
}
