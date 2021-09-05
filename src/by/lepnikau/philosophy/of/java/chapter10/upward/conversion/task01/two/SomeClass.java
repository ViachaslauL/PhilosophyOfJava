package by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task01.two;

import by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task01.one.ProtectedInner;

public class SomeClass {

    public class ProtectedInnerClass implements ProtectedInner {

        @Override
        public void protectedInnerMethod() {
            System.out.println("Protected inner method.");
        }
    }
}
