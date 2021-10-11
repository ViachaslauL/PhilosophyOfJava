package by.lepnikau.philosophy.of.java.chapter21.task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count of tasks: ");
        int value = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < value; i++) {
            Future<String> submit = exec.submit(new TaskClass());
            try {
                System.out.println(submit.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
    }
}
