package by.lepnikau.philosophy.of.java.chapter16.task01;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

public class TaskOneMain {
    private static BerylliumSphere[] spheres= {new BerylliumSphere(),
            new BerylliumSphere(),
            new BerylliumSphere()};

    public static void main(String[] args) {

        printSpheres(sphereInit());

    }

    private static BerylliumSphere[] sphereInit() {
        return spheres;
    }

    private static void printSpheres(BerylliumSphere[] spheres) {
        for (BerylliumSphere sphere : spheres) {
            System.out.println(sphere.toString());
        }
    }
}
