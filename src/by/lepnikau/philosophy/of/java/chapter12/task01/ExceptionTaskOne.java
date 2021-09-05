package by.viachaslau.chapter12.task01;

public class ExceptionTaskOne {
    public static void main(String[] args) {

        try{
            throw new Exception("Generated exception in try block");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block");
        }
    }
}
