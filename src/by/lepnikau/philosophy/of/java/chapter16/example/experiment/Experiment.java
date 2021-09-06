package by.lepnikau.philosophy.of.java.chapter16.example.experiment;

import java.util.ArrayList;
import java.util.List;

public class Experiment {
    public static void main(String[] args) {
        String str = "str";
        List<String>[] list = getList(str, 5);
        for (List<String> aList : list) {
            if (aList != null) {
                System.out.println(aList.toString());
            }
        }
    }

    private static <T> List<T>[] getList(T obj, int size) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(obj);
        }
        List<T>[] listArray = (List<T>[]) new List[10];
        listArray[0] = list;
        return listArray;
    }
}
