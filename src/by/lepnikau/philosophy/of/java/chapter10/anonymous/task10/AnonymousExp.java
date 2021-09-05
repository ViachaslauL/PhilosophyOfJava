package by.lepnikau.philosophy.of.java.chapter10.anonymous.task10;

interface AnonymousInterface {
    void action();
}

public class AnonymousExp {

    public AnonymousInterface getAnonymousObject() {
        return new AnonymousInterface() {
            @Override
            public void action() {
                System.out.println("Action in anonymous Object method.");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousExp exp = new AnonymousExp();
        exp.getAnonymousObject().action();
    }
}
