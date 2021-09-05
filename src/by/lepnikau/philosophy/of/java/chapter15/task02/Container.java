package by.lepnikau.philosophy.of.java.chapter15.task02;

import by.lepnikau.philosophy.of.java.chapter15.task02.clazz.A;

public class Container<T> {
    private T refOne;
    private T refTwo;
    private T refThree;

    public Container(T refOne, T refTwo, T refThree) {
        this.refOne = refOne;
        this.refTwo = refTwo;
        this.refThree = refThree;
    }

    public T getRefOne() {
        return refOne;
    }

    public void setRefOne(T refOne) {
        this.refOne = refOne;
    }

    public T getRefTwo() {
        return refTwo;
    }

    public void setRefTwo(T refTwo) {
        this.refTwo = refTwo;
    }

    public T getRefThree() {
        return refThree;
    }

    public void setRefThree(T refThree) {
        this.refThree = refThree;
    }

    public static void main(String[] args) {
        A a = new A("One");
        A b = new A("Two");
        A c = new A("Three");
        Container<A> container = new Container<>(a, b, c);
        container.getRefOne().getMessage();
        container.getRefTwo().getMessage();
        container.getRefThree().getMessage();
    }
}
