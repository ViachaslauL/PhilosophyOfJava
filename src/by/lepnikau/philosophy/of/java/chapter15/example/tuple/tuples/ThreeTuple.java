package by.lepnikau.philosophy.of.java.chapter15.example.tuple.tuples;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    private C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "c=" + c +
                ", ";
    }
}
