package by.lepnikau.philosophy.of.java.chapter14;

public class SomeClass {
    private String name = "Default";

    public SomeClass() {
    }

    public SomeClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] someMethod(String ... strings) {
        return strings;
    }
}
