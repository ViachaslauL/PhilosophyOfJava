package by.lepnikau.philosophy.of.java.chapter15.example.tuple.tuples;

public class TwoTuple<A, B> {
    private A a;
    private B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a +
                ", b=" + b + ", ";
    }
}
