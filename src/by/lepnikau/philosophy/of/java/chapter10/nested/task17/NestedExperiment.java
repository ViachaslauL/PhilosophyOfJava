package by.lepnikau.philosophy.of.java.chapter10.nested.task17;

public class NestedExperiment {

    class InnerClass {
        class NestedClass {
            private int value;

            public NestedClass(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
        }
    }

    public static void main(String[] args) {

        InnerClass.NestedClass nestedClass = new NestedExperiment().new InnerClass().new NestedClass(10);

        System.out.println(nestedClass.getValue());
    }
}
