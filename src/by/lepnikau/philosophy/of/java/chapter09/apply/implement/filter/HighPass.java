package by.lepnikau.philosophy.of.java.chapter09.apply.implement.filter;

public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}