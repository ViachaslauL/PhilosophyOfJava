package by.lepnikau.philosophy.of.java.chapter15.task10;

public class GenericMethodsTen {
    public static  <T, N> void f(T one, N two, Double three) {
        System.out.println(one.getClass().getSimpleName());
        System.out.println(two.getClass().getSimpleName());
        System.out.println(three.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f(1, 23L, 23.4);
    }
}
