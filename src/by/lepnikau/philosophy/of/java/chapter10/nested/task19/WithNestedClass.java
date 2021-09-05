package by.lepnikau.philosophy.of.java.chapter10.nested.task19;

public interface WithNestedClass {

    class NestedClass {

        public static int calculate() {
            return getValueA() + getValueB();
        }
    }

    static int getValueA() {
        return 15;
    }

    static int getValueB() {
        return 23;
    }

}
