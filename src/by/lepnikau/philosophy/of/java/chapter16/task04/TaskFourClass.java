package by.lepnikau.philosophy.of.java.chapter16.task04;

public class TaskFourClass {
    public static Double[][][] createDoubleArray(int iSize, int jSize, int kSize) {
        Double[][][] array = new Double[iSize][jSize][kSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                for (int k = 0; k < kSize; k++) {
                    array[i][j][k] = i + j + k +0.0;
                }
            }
        }
        return array;
    }

    public static void printDoubleArray(Double[][][] arr) {
        for (Double[][] doubles : arr) {
            for (Double[] aDouble : doubles) {
                for (Double bDouble : aDouble) {
                    System.out.print(bDouble + " ");
                }
            }
            System.out.println();
        }
    }
}
