package by.lepnikau.philosophy.of.java.chapter16.task07;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

public class TaskSevenMain {
    public static void main(String[] args) {

        for (BerylliumSphere[][] spheres : createArray(5, 6, 2)) {
            for (BerylliumSphere[] aSpheres : spheres) {
                for (BerylliumSphere sphere: aSpheres) {
                    System.out.print(sphere.toString() + " ");
                }
            }
            System.out.println();
        }
    }

    private static BerylliumSphere[][][] createArray(int iSize, int jSize, int kSize) {
        BerylliumSphere[][][] spheres = new BerylliumSphere[iSize][jSize][kSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                for (int k = 0; k < kSize; k++) {
                    spheres[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return spheres;
    }
}
