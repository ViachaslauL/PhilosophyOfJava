package by.lepnikau.philosophy.of.java.chapter13.task06;

public class SixTaskClass {
    private int intNumb;
    private long longNumb;
    private float floatNumb;
    private double doubleNumb;

    public SixTaskClass(int intNumb, long longNumb, float floatNumb, double doubleNumb) {
        this.intNumb = intNumb;
        this.longNumb = longNumb;
        this.floatNumb = floatNumb;
        this.doubleNumb = doubleNumb;
    }

    @Override
    public String toString() {
        return String.format("int: %d, long: %d, float: %.4f, double: %.4f", intNumb, longNumb, floatNumb, doubleNumb);
    }
}
