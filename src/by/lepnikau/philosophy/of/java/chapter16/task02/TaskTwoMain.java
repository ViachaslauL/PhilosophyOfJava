package by.lepnikau.philosophy.of.java.chapter16.task02;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

public class TaskTwoMain {
    public static void main(String[] args) {
        BerylliumSphere[] array = createArray(5);
        for (BerylliumSphere sphere: array) {
            System.out.println(sphere.toString());
        }
    }

    private static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[]spheres = new BerylliumSphere[size];
        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new BerylliumSphere();
        }
        return spheres;
    }
}
