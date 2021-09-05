package by.lepnikau.philosophy.of.java.chapter09;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharSeries implements Readable{

    private int count;
    private static Random random = new Random(47);
    private static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public CharSeries(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(chars[random.nextInt(chars.length)]);
        return cb.length();
    }

    public static void main(String[] args) {
        CharSeries charSeries = new CharSeries(15);
        Scanner scanner = new Scanner(charSeries);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
