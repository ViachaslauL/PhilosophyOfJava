package by.lepnikau.philosophy.of.java.pattern.front.controller;

public class DispatcherServlet {

    public void process(String url) {
        switch (url) {
            case "home":
                new HomePageController().view();
                break;
            case "user":
                new UserPageController().view();
                break;
            default: new DefaultController().view();
        }
    }
}
