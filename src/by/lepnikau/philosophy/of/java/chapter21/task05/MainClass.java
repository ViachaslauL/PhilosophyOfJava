package by.lepnikau.philosophy.of.java.chapter21.task05;

import by.lepnikau.philosophy.of.java.chapter15.task02.clazz.A;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            futures.add(exec.submit(new FibonacciTask(8)));
        }

        for (Future<String> fs : futures) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
