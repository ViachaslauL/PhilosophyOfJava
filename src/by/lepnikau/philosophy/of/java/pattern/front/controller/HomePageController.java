package by.lepnikau.philosophy.of.java.pattern.front.controller;

public class HomePageController implements Controller{
    @Override
    public void view() {
        System.out.println("This is home page");
    }
}
