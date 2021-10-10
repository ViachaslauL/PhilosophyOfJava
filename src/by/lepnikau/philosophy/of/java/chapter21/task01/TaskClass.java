package by.lepnikau.philosophy.of.java.chapter21.task01;

class TaskClass implements Runnable{
    private static int taskCount = 0;
    protected final int id = taskCount++;

    public TaskClass() {
        System.out.println("This is a Thread #" + id);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Message " + i + " from thread #" +id);
            Thread.yield();
        }
    }
}
