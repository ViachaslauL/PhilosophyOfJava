package by.lepnikau.philosophy.of.java.chapter15.task05.stack;

public interface AbstractStack<T> {
    T peek();
    T pop();
    void push(T elem);
}
