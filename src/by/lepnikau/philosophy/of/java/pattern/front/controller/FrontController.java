package by.lepnikau.philosophy.of.java.pattern.front.controller;

import java.util.Scanner;

public class FrontController {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine();
                new Thread() {
                    @Override
                    public void run() {
                        new DispatcherServlet().process(nextLine);
                    }
                }.start();
            }
        }
    }
}
