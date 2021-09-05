package by.lepnikau.philosophy.of.java.chapter12.task05;

import java.util.Scanner;

public class ExceptionTaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = 10;

        while (true) {
            try {
                System.out.println("Введите единицу");
                String string = scanner.nextLine();
                numb = numb / getNumber(string);
                break;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    private static int getNumber(String number) {
        if (!number.equals("1")) {
            return 0;
        }
        return 1;
    }
}
