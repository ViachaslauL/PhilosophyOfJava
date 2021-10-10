package by.lepnikau.philosophy.of.java.chapter21.task06;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class TaskClass implements Callable<String> {
    private final Random random = new Random();
    private static int taskCount = 0;
    protected final int id = taskCount++;

    @Override
    public String call() throws Exception {
        int rSec = random.nextInt(9) + 1;
        TimeUnit.SECONDS.sleep(rSec);
        return "Task#" + id + " countdown:" + rSec;
    }
}
