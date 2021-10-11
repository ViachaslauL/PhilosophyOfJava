package by.lepnikau.philosophy.of.java.chapter21.task01;

class MainClass {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new Thread(new TaskClass()).start();
        }
    }
}
