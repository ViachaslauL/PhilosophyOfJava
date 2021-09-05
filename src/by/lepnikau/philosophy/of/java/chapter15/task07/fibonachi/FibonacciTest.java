package by.lepnikau.philosophy.of.java.chapter15.task07.fibonachi;

public class FibonacciTest {
    public static void main(String[] args){

        /*Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < 18; i++) {
            System.out.print(fibonacci.next() + " ");
        }*/

        IterableFibonacci fibonacciSized = new IterableFibonacci(new Fibonacci(), 18);
        IterableFibonacci fibonacci = new IterableFibonacci(new Fibonacci());

        for (Integer integer : fibonacciSized) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibonacci.next() + " ");
        }

    }
}
