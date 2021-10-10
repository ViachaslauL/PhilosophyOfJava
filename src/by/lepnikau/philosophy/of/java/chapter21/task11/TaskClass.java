package by.lepnikau.philosophy.of.java.chapter21.task11;

class TaskClass implements Runnable{
    protected Resource res;
    private static int taskCount = 0;
    protected final int id = taskCount++;

    public TaskClass(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            if (res.getFieldOne() % 2 == 0) {
                res.incrOne();
                res.incrTwo();
            } else if (res.getFieldTwo() % 2 != 0) {
                res.incrTwo();
            } else {
                break;
            }
        }
        System.out.println("Task#" + id +
                " f1: " + res.getFieldOne() +
                " f2: " + res.getFieldTwo());
    }
}
