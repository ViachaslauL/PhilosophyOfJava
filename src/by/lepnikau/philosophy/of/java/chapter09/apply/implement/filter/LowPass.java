package by.lepnikau.philosophy.of.java.chapter09.apply.implement.filter;

public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public WaveForm process(WaveForm input) {
        return input; // Фиктивная обработка
    }
}
