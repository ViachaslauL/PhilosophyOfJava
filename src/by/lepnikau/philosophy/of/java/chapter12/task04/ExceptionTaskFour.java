package by.lepnikau.philosophy.of.java.chapter12.task04;

public class ExceptionTaskFour {
    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(nullPointer(str));
        } catch (TaskFourException e) {
            System.out.println(e.getTaskFourMessage());
        }

    }

    private static String nullPointer(String string) throws TaskFourException {
        if(string == null){
            throw new TaskFourException("Some message");
        }
        return string;
    }
}
