package by.lepnikau.philosophy.of.java.chapter10.nested.task18;

public class WithNestedClassImpl implements WithNestedClass{

    @Override
    public void interfaceMethod() {
        System.out.println("Interface method");
    }

    public static void main(String[] args) {
        WithNestedClassImpl withNestedClass = new WithNestedClassImpl();
        withNestedClass.interfaceMethod();

        NestedClass nestedClass = new NestedClass(10);
        System.out.println(nestedClass.getValue());

    }
}
