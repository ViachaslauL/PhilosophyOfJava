package by.lepnikau.philosophy.of.java.chapter15.example.stack;

public class TestClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer integer;
        while ((integer = stack.pop()) != null) {
            System.out.println(integer);
        }
    }
}
