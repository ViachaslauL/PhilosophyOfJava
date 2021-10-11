package by.lepnikau.philosophy.of.java.chapter21.example.callable;

import java.util.concurrent.Callable;

class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "Result of TaskWithResult: " + id;
    }
}
