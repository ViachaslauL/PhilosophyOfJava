package by.lepnikau.philosophy.of.java.chapter21.task02;

class FibonacciTask implements Runnable{
    private int count = 0;
    private int length;
    private static int taskCount = 0;
    protected final int id = taskCount++;

    public FibonacciTask(int length) {
        this.length = length;
    }

    @Override
    public void run() {
        for (int i = 0; i < length; i++) {
            System.out.println("Task #" + id+ " " + fib(count++));
        }
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
