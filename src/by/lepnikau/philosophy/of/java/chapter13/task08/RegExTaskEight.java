package by.lepnikau.philosophy.of.java.chapter13.task08;

public class RegExTaskEight {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        String[] strings = splitString(knights);
        for (String s: strings) {
            System.out.print("[" + s + "]");
        }
    }

    private static String[] splitString(String string) {
        return string.split("the | you");
    }
}
