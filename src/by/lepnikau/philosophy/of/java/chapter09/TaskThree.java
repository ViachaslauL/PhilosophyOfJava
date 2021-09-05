package by.lepnikau.philosophy.of.java.chapter09;

public class TaskThree {
    public static void main(String[] args) {

        DerivativeClass derivativeClass = new DerivativeClass();
        derivativeClass.print();

    }
}

class DerivativeClass extends BaseClass{

    private int var = 1;

    @Override
    void print() {
        System.out.println("var = " + var);
    }
}

abstract class BaseClass {

    BaseClass() {
        print();
    }

    abstract void print();

}