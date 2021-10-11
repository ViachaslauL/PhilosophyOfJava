package by.lepnikau.philosophy.of.java.chapter21.example.cuncurency;

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
