package by.lepnikau.philosophy.of.java.chapter14.petcount.creator;

import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.dog.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    // Блок try не нужен.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(
                    Arrays.asList(
                            Pet.class, Dog.class, Cat.class, Rodent.class,
                            Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                            Cymric.class, Rat.class, Mouse.class, Hamster.class, Gerbil.class)
            ); // Типы, которые должны создаваться случайным образом:

    public static void main(String[] args) {
        System.out.println(types);
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }

    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
}
