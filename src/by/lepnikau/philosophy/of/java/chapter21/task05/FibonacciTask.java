package by.lepnikau.philosophy.of.java.chapter21.task05;

import java.util.concurrent.Callable;

class FibonacciTask implements Callable<String> {
    private int count = 0;
    private int length;
    private static int taskCount = 0;
    protected final int id = taskCount++;

    public FibonacciTask(int length) {
        this.length = length;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("[Task #").append(id).append(" ").append(fib(count++)).append("] ");
        }
        return sb.toString();
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
