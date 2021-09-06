package by.lepnikau.philosophy.of.java.chapter16.task06;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

public class TaskSixMain {
    public static void main(String[] args) {

        for (BerylliumSphere[] spheres : createArray(5, 6)) {
            for (BerylliumSphere sphere : spheres) {
                System.out.print(sphere.toString() + " ");
            }
            System.out.println();
        }
    }

    private static BerylliumSphere[][] createArray(int iSize, int jSize) {
        BerylliumSphere[][] spheres = new BerylliumSphere[iSize][jSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                spheres[i][j] = new BerylliumSphere();
            }
        }
        return spheres;
    }
}
