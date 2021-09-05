package by.lepnikau.philosophy.of.java.chapter11.list.task05;

import java.util.*;

import static by.lepnikau.philosophy.of.java.util.PrintLN.print;

public class ListFeaturesWithInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> integers = getArrayList(10);
        print("l: " + integers);
        integers.add(13); // С автоматическим изменением размера
        print("2: " + integers);
        print("3: " + integers.contains(13));
        integers.remove(10); // Удаление заданного объекта
        Integer p = integers.get(2);
        print("4: " + p + " " + integers.indexOf(p));
        Integer cymric = 7;
        print("5: " + integers.indexOf(cymric));
        print("6: " + integers.remove(cymric));
        // Удаление заданного объекта:
        print("7: " + integers.remove(p));
        print("8: " + integers);
        integers.add(3, 8); // Вставка по индексу
        print("9: " + integers);
        List<Integer> sub = integers.subList(1, 6);
        print("Частичный список: " + sub);
        print("10: " + integers.containsAll(sub));
        Collections.sort(sub); // Сортировка "на месте"
        print("После сортировки: " + sub);
        // Для containsAll() порядок не важен:
        print("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, rand); // Перемешивание
        print("После перемешивания: " + sub);
        print("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<>(integers); // Копирование
        copy.remove(2); // Удаление по индексу
        print("14: " + copy);
        copy.removeAll(sub); // Удаление заданных объектов
        print("15: " + copy);
        copy.set(1, 8); // Замена элемента
        print("16: " + copy);
        copy.addAll(2, sub); // Вставка списка в середину
        print("17: " + copy);
        print("18: " + integers.isEmpty());
        integers.clear(); // Удаление всех элементов
        print("19: " + integers);
        print("20: " + integers.isEmpty());
        integers.addAll(getArrayList(4));
        print("21: " + integers);
        Object[] o = integers.toArray();
        print("22: " + o[3]);
        //Integer[] pa = integers.toArray();
        //print("23: " + pa[3].id());
    }

    private static List<Integer> getArrayList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }

        return list;
    }
}
