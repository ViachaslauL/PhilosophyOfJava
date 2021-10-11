package by.lepnikau.philosophy.of.java.pattern.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass = null;
    private int number;

    private SingletonClass() {
    }

    public static SingletonClass getSingletonClass() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
