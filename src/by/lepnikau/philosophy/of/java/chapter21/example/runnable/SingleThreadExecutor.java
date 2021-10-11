package by.lepnikau.philosophy.of.java.chapter21.example.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThreadExecutor {
    public static void main(String[] args) {

        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
