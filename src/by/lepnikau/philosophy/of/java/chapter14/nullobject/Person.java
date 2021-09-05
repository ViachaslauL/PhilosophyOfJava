package by.lepnikau.philosophy.of.java.chapter14.nullobject;

public class Person {
    private final String first;
    private final String second;
    private final String address;
    public static final Person NULL = new NullPerson();

    public Person(String first, String second, String address) {
        this.first = first;
        this.second = second;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + second + " " + address;
    }

    public static class NullPerson extends Person implements Null {

        public NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "Person: NullPerson";
        }
    }
}
