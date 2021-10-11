package by.lepnikau.philosophy.of.java.chapter21.example.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FixedThreadPoll {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
