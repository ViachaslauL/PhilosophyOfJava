package by.lepnikau.philosophy.of.java.chapter17.example.hashcode;

import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;
import by.lepnikau.philosophy.of.java.util.MapOfList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        for (List<? extends Pet> lp : MapOfList.petPeople.values()) {
            for (Pet p : lp) {
                pets.add(p);
            }
        }
        System.out.println(pets);
    }
}
