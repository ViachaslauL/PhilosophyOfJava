package by.lepnikau.philosophy.of.java.chapter17.example.countedstring;

import java.util.*;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        s = str;
        created.add(s);

        for (String string : created) {
            if (string.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString &&
                id == ((CountedString) o).id &&
                s.equals(((CountedString) o).s);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }
        for (Map.Entry<CountedString, Integer> entry : map.entrySet()) {
            System.out.println(entry.toString());
        }

        for (CountedString cString: cs) {
            print("Looking up: " + cString + " key: " + map.get(cString));
        }
    }
}
