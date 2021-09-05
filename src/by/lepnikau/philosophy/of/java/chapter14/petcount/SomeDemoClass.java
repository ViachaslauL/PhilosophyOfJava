package by.lepnikau.philosophy.of.java.chapter14.petcount;

import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.Cat;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.Manx;

public class SomeDemoClass {
    public static void main(String[] args) {

        Pet pet = new Pet();
        Manx manx = new Manx();

        System.out.println(areObjectsAssignable(pet, manx));

        System.out.println(pet.getClass().isAssignableFrom(manx.getClass()));

    }

    public static boolean areObjectsAssignable(Object objectA, Object objectB) {
        return objectA.getClass().isInstance(objectB);
    }
}
