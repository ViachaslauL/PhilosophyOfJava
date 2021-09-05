package by.lepnikau.philosophy.of.java.chapter14.petcount.creator;

import by.lepnikau.philosophy.of.java.chapter14.petcount.creator.PetCreator;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.dog.Mutt",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.dog.Pug",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.EgyptianMau",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.Manx",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.Cymric",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.Rat",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.Mouse",
            "by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
