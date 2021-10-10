package by.lepnikau.philosophy.of.java.chapter21.example.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
