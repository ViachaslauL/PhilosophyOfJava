package by.lepnikau.philosophy.of.java.chapter21.task03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MainClass {
    public static void main(String[] args) {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++) {
            cachedThreadPool.execute(new TaskClass());
        }
        cachedThreadPool.shutdown();

        System.out.println("-----");

        for (int i = 0; i < 3; i++) {
            fixedThreadPool.execute(new TaskClass());
        }
        fixedThreadPool.shutdown();

        System.out.println("-----");

        for (int i = 0; i < 3; i++) {
            singleThreadExecutor.execute(new TaskClass());
        }
        singleThreadExecutor.shutdown();
    }
}
