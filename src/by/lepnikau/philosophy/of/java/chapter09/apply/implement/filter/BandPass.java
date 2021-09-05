package by.lepnikau.philosophy.of.java.chapter09.apply.implement.filter;

public class BandPass extends Filter {
    double lowCutoff;
    double highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}
