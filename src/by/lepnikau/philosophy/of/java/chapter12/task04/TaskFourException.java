package by.lepnikau.philosophy.of.java.chapter12.task04;

public class TaskFourException extends Exception{

    private String message;

    public TaskFourException(String message) {
        super(message);
        this.message = message;
    }

    public String getTaskFourMessage() {
        return message;
    }
}
