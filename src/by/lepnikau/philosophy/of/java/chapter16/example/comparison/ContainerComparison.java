package by.lepnikau.philosophy.of.java.chapter16.example.comparison;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];

        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }

        print(Arrays.toString(spheres));
        print(spheres[4]);
        List<BerylliumSphere> sphereList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }

        print(sphereList);
        print(sphereList.get(4));
        int[] integers = {0, 1, 2, 3, 4, 5};
        print(Arrays.toString(integers));
        print(integers[4]);
        List<Integer> intList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        print(intList);
        print(intList.get(4));
    }
}
