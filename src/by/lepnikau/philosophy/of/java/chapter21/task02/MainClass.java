package by.lepnikau.philosophy.of.java.chapter21.task02;

class MainClass {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(new FibonacciTask(18)).start();
        }

    }
}
