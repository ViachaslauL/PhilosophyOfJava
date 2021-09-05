package by.lepnikau.philosophy.of.java.chapter15.task09;

public class GenericMethodsNine {
    public static  <T, N, U> void f(T one, N two, U three) {
        System.out.println(one.getClass().getSimpleName());
        System.out.println(two.getClass().getSimpleName());
        System.out.println(three.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f(1, 23L, 23.4);
    }
}
