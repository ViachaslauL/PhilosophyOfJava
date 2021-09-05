package by.lepnikau.philosophy.of.java.chapter09.apply.implement.filter;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}