package by.lepnikau.philosophy.of.java.chapter15.task07.fibonachi;

import by.lepnikau.philosophy.of.java.chapter15.example.face.Generator;

public class Fibonacci implements Generator<Integer> {

    private Integer count = 0;

    public Fibonacci() {
    }

    @Override
    public Integer next(){
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
