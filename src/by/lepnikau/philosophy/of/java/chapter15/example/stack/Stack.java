package by.lepnikau.philosophy.of.java.chapter15.example.stack;

public class Stack<T> implements AbstractStack<T> {

    private Node<T> top = new Node<>();

    @Override
    public T peek() {
        if (top != null) {
            return top.element;
        }
        return null;
    }

    @Override
    public T pop() {
        T result = top.element;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    @Override
    public void push(T elem) {
        top = new Node<>(elem, top);
    }

    private static class Node<U> {
        Node<U> next;
        U element;

        Node() {
            next = null;
            element = null;
        }

        Node(U element, Node<U> next) {
            this.next = next;
            this.element = element;
        }

        boolean end() {
            return element == null && next == null;
        }
    }
}
