package by.lepnikau.philosophy.of.java.chapter09.apply.inheritance;

import java.util.Arrays;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    String process(Object input) { // Ковариантный возвращаемый тип
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
                // Аргумент split() используется для разбиения строки
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }

    public static void process(Processor p, Object s) {
        print("Используем Processor " + p.name());
        print(p.process(s));
    }
}
