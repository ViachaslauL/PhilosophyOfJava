package by.lepnikau.philosophy.of.java.chapter21.task11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {

        Resource twoFieldsClass = new Resource();
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new TaskClass(twoFieldsClass));
        }
        exec.shutdown();
    }
}
