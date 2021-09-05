package by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task01.three;

import by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task01.one.ProtectedInner;
import by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task01.two.SomeClass;

public class DerivedClass extends SomeClass {

    public ProtectedInner getInnerClass() {
        SomeClass someClass = new SomeClass();
        return someClass.new ProtectedInnerClass();
    }

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        ProtectedInner innerClass = derivedClass.getInnerClass();
        innerClass.protectedInnerMethod();
    }
}
