package by.lepnikau.philosophy.of.java.chapter09.apply.implement.filter;

public class WaveForm {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}
