package by.lepnikau.philosophy.of.java.chapter12;

public class WhoCalled {
    public static void main(String[] args) {
        f();
        System.out.println("------------------------");
        g();
        System.out.println("------------------------");
        h();
    }

    private static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.getMethodName());
            }
        }
    }

    private static void g() {
        f();
    }

    private static void h() {
        g();
    }
}
