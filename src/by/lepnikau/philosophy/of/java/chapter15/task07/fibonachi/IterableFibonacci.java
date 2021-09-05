package by.lepnikau.philosophy.of.java.chapter15.task07.fibonachi;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer>{

    private int n;
    private final Fibonacci fibonacci;

    public IterableFibonacci(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    public IterableFibonacci(Fibonacci fibonacci, int size) {
        this.fibonacci = fibonacci;
        this.n = size;
    }

    public Integer next() {
        return fibonacci.next();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }
}
