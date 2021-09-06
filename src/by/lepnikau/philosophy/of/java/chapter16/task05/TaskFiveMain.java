package by.lepnikau.philosophy.of.java.chapter16.task05;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

public class TaskFiveMain {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = new BerylliumSphere[5][5];
        for (BerylliumSphere[] aSpheres : spheres) {
            for (BerylliumSphere sphere : aSpheres) {
                System.out.print(sphere + " ");
            }
            System.out.println();
        }
    }
}
