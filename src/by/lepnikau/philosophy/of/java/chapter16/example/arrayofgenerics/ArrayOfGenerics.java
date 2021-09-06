package by.lepnikau.philosophy.of.java.chapter16.example.arrayofgenerics;

import by.lepnikau.philosophy.of.java.chapter16.example.been.BerylliumSphere;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la; // "Неконтролируемое" предупреждение
        ls[0] = new ArrayList<>();
        // Проверка во время компиляции приводит к ошибке:
        //! ls[l] = new ArrayList<Integer>();
        // Проблема: List<String> является подтипом Object
        Object[] objects = ls;// Значит, присваивание допустимо
        // Компилируется и выполняется без ошибок:
        objects[1] = new ArrayList<Integer>();
        // Однако при простейших потребностях можно создать массив
        // обобщений, хотя и с "неконтролируемым" предупреждением:
        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i = 0; i < spheres.length; i++)
            spheres[i] = new ArrayList<>();
    }
}
