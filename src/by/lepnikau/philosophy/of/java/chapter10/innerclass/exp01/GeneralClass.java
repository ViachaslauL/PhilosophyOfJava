package by.lepnikau.philosophy.of.java.chapter10.innerclass.exp01;

import by.lepnikau.philosophy.of.java.chapter10.innerclass.exp01.first.First;
import by.lepnikau.philosophy.of.java.chapter10.innerclass.exp01.second.Second;
import by.lepnikau.philosophy.of.java.chapter10.innerclass.exp01.third.Third;

public class GeneralClass extends First {

    public void printFirstClassNumbers() {
        GeneralClass generalClass = new GeneralClass();
        System.out.println("First class number A: " + generalClass.getFirstClassNumberA());
        System.out.println("First class number B: " + generalClass.getFirstClassNumberB());
    }

    public void printSecondClassNumbers() {
        InnerSecond innerSecond = new InnerSecond();
        System.out.println("Second class number A: " + innerSecond.getInnerSecondNumberA());
        System.out.println("Second class number B: " + innerSecond.getInnerSecondNumberB());
    }

    public void printThirdClassNumbers() {
        InnerThird innerThird = new InnerThird();
        System.out.println("Third class number A: " + innerThird.getInnerThirdNumberA());
        System.out.println("Third class number B: " + innerThird.getInnerThirdNumberB());
    }

    private class InnerSecond extends Second {

        public int getInnerSecondNumberA() {
            return getSecondClassNumberA();
        }

        public int getInnerSecondNumberB() {
            return getSecondClassNumberB();
        }

    }

    private class InnerThird extends Third {

        public int getInnerThirdNumberA() {
            return getThirdClassNumberA();
        }

        public int getInnerThirdNumberB() {
            return getThirdClassNumberB();
        }

    }
}
