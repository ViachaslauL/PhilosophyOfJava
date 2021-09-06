package by.lepnikau.philosophy.of.java.chapter16.task03;

public class TaskThreeClass {
    public static Double[][] createDoubleArray(int iSize, int jSize) {
        Double[][] array = new Double[iSize][jSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                array[i][j] = i + j + 0.0;
            }
        }
        return array;
    }

    public static void printDoubleArray(Double[][] arr) {
        for (Double[] doubles : arr) {
            for (Double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
