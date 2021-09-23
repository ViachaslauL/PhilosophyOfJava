package by.lepnikau.philosophy.of.java.chapter17.task26;

import by.lepnikau.philosophy.of.java.chapter17.example.countedstring.CountedString;

import java.util.HashMap;
import java.util.Map;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class CountedStringExtended extends CountedString {
    private char someChar;

    public CountedStringExtended(String str, char sChar) {
        super(str);
        this.someChar = sChar;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) &&
                someChar == ((CountedStringExtended) o).someChar;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 37 * result + (int) someChar;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " someChar: " + someChar;
    }

    public static void main(String[] args) {
        Map<CountedStringExtended, Integer> map = new HashMap<>();
        CountedStringExtended[] cs = new CountedStringExtended[5];

        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedStringExtended("hi", 'a');
            map.put(cs[i], i);
        }

        for (Map.Entry<CountedStringExtended, Integer> entry: map.entrySet()) {
            print(entry.toString());
        }

        for (CountedStringExtended cString : cs) {
            print("Looking up: " + cString + " key: " + map.get(cString));
        }
    }
}
