package by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task02;

public class OuterClass {

    protected int numb = 1;

    protected void printNumb() {
        System.out.println("Numb is: " + numb);
    }

    public void outerClassMethod() {
        InnerClass innerClass = getInnerClass();
        innerClass.innerClassMethod();
    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public void getElement() {
        InnerClass innerClass = getInnerClass();
        System.out.println("InnerClass element: " + innerClass.element);
    }

    class InnerClass {

        private int element = 3;

        public void innerClassMethod() {
            numb = 2;

            printNumb();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerClassMethod();
        outerClass.getElement();
    }
}
