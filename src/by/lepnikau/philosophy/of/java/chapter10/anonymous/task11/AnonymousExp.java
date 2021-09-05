package by.lepnikau.philosophy.of.java.chapter10.anonymous.task11;

interface AnonymousInterface {
    void action();
}

public class AnonymousExp {

    private AnonymousInterface getAnonymousObject() {
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

class AnotherClass {
    public static void main(String[] args) {

        AnonymousExp exp = new AnonymousExp();
        //exp.getAnonymousObject();
    }
}
