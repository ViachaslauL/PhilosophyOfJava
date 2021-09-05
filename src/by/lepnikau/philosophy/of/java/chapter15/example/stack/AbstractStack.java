package by.lepnikau.philosophy.of.java.chapter15.example.stack;

public interface AbstractStack<T> {
    T peek();
    T pop();
    void push(T elem);
}
