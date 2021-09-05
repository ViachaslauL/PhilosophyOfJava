package by.lepnikau.philosophy.of.java.chapter10.nested.task16;

interface SomeClass {

    int getSomeClassNumber();

}

class SomeClassImpl implements SomeClass {

    private int number;

    SomeClassImpl(int numb) {
        number = numb;
    }

    @Override
    public int getSomeClassNumber() {
        return number;
    }
}

public class NestedClassTest {

    private static class NestedClass {

        private int value = 1;

        public int getValue() {
            return value;
        }

        public SomeClassImpl getSomeClassValue(final int number) {
            return new SomeClassImpl(number) {
                public int getSomeClassNumber() {
                    return number * 10;
                }
            };
        }

    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        int value = nestedClass.getValue();
        System.out.println(value);

        SomeClassImpl someClassValue = nestedClass.getSomeClassValue(10);
        System.out.println(someClassValue.getSomeClassNumber());
    }
}
