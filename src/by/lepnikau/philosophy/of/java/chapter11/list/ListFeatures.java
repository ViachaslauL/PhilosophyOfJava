package by.lepnikau.philosophy.of.java.chapter11.list;

import by.lepnikau.philosophy.of.java.util.typeinfo.Pets;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Cymric;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Hamster;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Mouse;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet.Pet;

import java.util.*;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(10);
        print("l: " + pets);
        Hamster h = new Hamster();
        pets.add(h); // С автоматическим изменением размера
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h); // Удаление заданного объекта
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        // Удаление заданного объекта:
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3, new Mouse()); // Вставка по индексу
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 6);
        print("Частичный список: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub); // Сортировка "на месте"
        print("После сортировки: " + sub);
        // Для containsAll() порядок не важен:
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand); // Перемешивание
        print("После перемешивания: " + sub);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Pet>(pets); // Копирование
        copy.remove(2); // Удаление по индексу
        print("14: " + copy);
        copy.removeAll(sub); // Удаление заданных объектов
        print("15: " + copy);
        copy.set(1, new Mouse()); // Замена элемента
        print("16: " + copy);
        copy.addAll(2, sub); // Вставка списка в середину
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear(); // Удаление всех элементов
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        //print("23: " + pa[3].id());
    }
}
