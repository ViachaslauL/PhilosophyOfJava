package by.lepnikau.philosophy.of.java.chapter10.anonymous.task12;

class First {
    public First(int value) {
    }

    public void printValue() {
    }
}

class Second {

    public First getFirst(final int val) {
        return new First(val) {
            private int value = val;

            public void printValue() {
                System.out.println(value);
            }
        };
    }
}

public class TaskTwelve {
    public static void main(String[] args) {
        Second second = new Second();
        First first = second.getFirst(10);
        first.printValue();
    }
}
