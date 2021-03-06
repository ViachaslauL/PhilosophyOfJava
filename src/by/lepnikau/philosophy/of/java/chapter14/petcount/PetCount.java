package by.lepnikau.philosophy.of.java.chapter14.petcount;

import by.lepnikau.philosophy.of.java.chapter14.petcount.creator.PetCreator;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.dog.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.*;

import java.util.HashMap;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            // Подсчет объектов Pet:
            printnb(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog)
                counter.count("Dog");
            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Pug");
            if (pet instanceof Cat)
                counter.count("Cat");
            if (pet instanceof Manx)
                counter.count("EgyptianMau");
            if (pet instanceof Manx)
                counter.count("Manx");
            if (pet instanceof Manx)
                counter.count("Cymric");
            if (pet instanceof Rodent)
                counter.count("Rodent");
            if (pet instanceof Rat)
                counter.count("Rat");
            if (pet instanceof Mouse)
                counter.count("Mouse");
            if (pet instanceof Hamster)
                counter.count("Hamster");
        }
        // Вывод счетчиков:
        print();
        print(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
