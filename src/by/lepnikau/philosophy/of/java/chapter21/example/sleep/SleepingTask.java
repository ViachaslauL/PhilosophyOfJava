package by.lepnikau.philosophy.of.java.chapter21.example.sleep;

import by.lepnikau.philosophy.of.java.chapter21.example.runnable.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SleepingTask extends LiftOff {

    @Override
    public void run() {
        try {
            while (countDown -- > 0) {
                System.out.print(status());
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
