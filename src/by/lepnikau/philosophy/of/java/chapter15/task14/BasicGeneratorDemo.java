package by.lepnikau.philosophy.of.java.chapter15.task14;

public class BasicGeneratorDemo {
    public static void main(String[] args) {

        BasicGeneratorFourteen<CountedObject> generator = new BasicGeneratorFourteen<>(CountedObject.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}
