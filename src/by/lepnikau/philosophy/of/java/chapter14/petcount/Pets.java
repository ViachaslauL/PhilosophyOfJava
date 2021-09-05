package by.lepnikau.philosophy.of.java.chapter14.petcount;

import by.lepnikau.philosophy.of.java.chapter14.petcount.creator.ForNameCreator;
import by.lepnikau.philosophy.of.java.chapter14.petcount.creator.LiteralPetCreator;
import by.lepnikau.philosophy.of.java.chapter14.petcount.creator.PetCreator;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;

import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
