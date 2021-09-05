package by.lepnikau.philosophy.of.java.chapter14;

interface A {
    void f();
}

class B implements A {

    @Override
    public void f() {
        System.out.println("Method f");
    }

    public void g() {
        System.out.println("Method g");
    }
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();

        System.out.println(a.getClass().getSimpleName());

        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
}
