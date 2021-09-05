package by.lepnikau.philosophy.of.java.chapter09.apply.implement;

import java.util.Arrays;

import static by.lepnikau.philosophy.of.java.util.PrintLN.print;

interface Processor {

    String name();

    Object process(Object input);

}

abstract class StringProcessor implements Processor {

    public static String s = "If she weighs the same as a duck, she's made of wood";

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static void main(String[] args) {
        //Apply.process(new UpCase(), s);
        //Apply.process(new DownCase(), s);
        //Apply.process(new Splitter(), s);
        Apply.process(new StringManipulator(), s);
    }
}

class UpCase extends StringProcessor {
    public String process(Object input) { // Ковариантный возвращаемый тип
        return ((String) input).toUpperCase();
    }
}

class DownCase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
