package by.lepnikau.philosophy.of.java.chapter12.task03;

public class ExceptionTaskThree {
    public static void main(String[] args) {

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        try {
            System.out.println(ints[11]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.toString());
            }
        }

    }
}
