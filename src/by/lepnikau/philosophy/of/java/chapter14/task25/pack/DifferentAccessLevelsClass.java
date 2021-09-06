package by.lepnikau.philosophy.of.java.chapter14.task25.pack;

public class DifferentAccessLevelsClass {

    void packageAccess() {
        System.out.println("Package access");
    }

    private void privateAccess() {
        System.out.println("Private access");
    }

    protected void protectedAccess() {
        System.out.println("Protected access");
    }
}
