package by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task03;

interface ExpTwoInnerClassInterface {
    void action();
}

public class InnerClassExpTwo {

    private class ClassInnerClass implements ExpTwoInnerClassInterface {

        @Override
        public void action() {
            System.out.println("Action in inner class method.");
        }
    }

    public ExpTwoInnerClassInterface getInnerClass() {
        return new ClassInnerClass();
    }

    public static void main(String[] args) {
        InnerClassExpTwo innerClassExpTwo = new InnerClassExpTwo();
        innerClassExpTwo.getInnerClass().action();
    }
}

class AnotherClass {
    public static void main(String[] args) {

        InnerClassExpTwo innerClassExpTwo = new InnerClassExpTwo();
        //InnerClassExpTwo.InnerClass innerClass = (InnerClassExpTwo.InnerClass) innerClassExpTwo.getInnerClass();
        //innerClass.action();
    }
}
