package by.viachaslau.chapter12.task02;

public class ExceptionTaskTwo {
    public static void main(String[] args) {

        String str = null;

        try {
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
