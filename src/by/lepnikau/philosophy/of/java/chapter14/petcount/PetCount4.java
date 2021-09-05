package by.lepnikau.philosophy.of.java.chapter14.petcount;

import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;
import by.lepnikau.philosophy.of.java.util.TypeCounter;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
