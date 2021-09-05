package by.lepnikau.philosophy.of.java.chapter15.example.tuple.tuples;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    private D d;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString() {
        return super.toString() +
                "d=" + d +
                ", ";
    }
}
