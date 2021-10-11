package by.lepnikau.philosophy.of.java.pattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        singletonClass.setNumber(10);
        System.out.println(singletonClass.getNumber());

        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass1.getNumber());

    }
}
