package by.lepnikau.philosophy.of.java.chapter10.nested.task18;

public interface WithNestedClass {

    class NestedClass {
        private int value;

        public NestedClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    void interfaceMethod();
}
