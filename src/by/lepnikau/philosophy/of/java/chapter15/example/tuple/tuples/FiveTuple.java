package by.lepnikau.philosophy.of.java.chapter15.example.tuple.tuples;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    private E f;

    public FiveTuple(A a, B b, C c, D d, E f) {
        super(a, b, c, d);
        this.f = f;
    }

    @Override
    public String toString() {
        return super.toString() +
                "f=" + f +
                "";
    }
}
