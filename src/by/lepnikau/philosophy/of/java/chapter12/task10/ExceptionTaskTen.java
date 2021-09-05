package by.lepnikau.philosophy.of.java.chapter12.task10;

public class ExceptionTaskTen {
    public static void main(String[] args) {

        try {
            f();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    private static void g() throws NullPointerException {
        throw new NullPointerException();
    }

    private static void f() throws NoSuchFieldException {
        try {
            g();
        } catch (RuntimeException e) {
            throw new NoSuchFieldException();
        }
    }
}
