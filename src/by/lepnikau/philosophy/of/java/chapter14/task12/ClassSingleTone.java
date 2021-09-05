package by.lepnikau.philosophy.of.java.chapter14.task12;

public class ClassSingleTone {
    private static ClassSingleTone singleTone;
    private String name;

    private ClassSingleTone() {}

    public static ClassSingleTone getSingleTone() {
        if (singleTone == null) {
            singleTone = new ClassSingleTone();
        }
        return singleTone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ClassSingleTone singleToneOne = ClassSingleTone.getSingleTone();
        singleToneOne.setName("Some name");
        ClassSingleTone singleToneTwo = ClassSingleTone.getSingleTone();
        System.out.println(singleToneTwo.getName());
    }
}
