package by.lepnikau.philosophy.of.java.chapter21.task04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MainClass {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 2; i++) {
            cachedThreadPool.execute(new FibonacciTask(5));
        }
        cachedThreadPool.shutdown();

        for (int i = 0; i < 2; i++) {
            fixedThreadPool.execute(new FibonacciTask(5));
        }
        fixedThreadPool.shutdown();

        for (int i = 0; i < 2; i++) {
            singleThreadExecutor.execute(new FibonacciTask(5));
        }
        singleThreadExecutor.shutdown();
    }
}
