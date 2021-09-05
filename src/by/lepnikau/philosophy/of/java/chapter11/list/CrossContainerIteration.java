package by.lepnikau.philosophy.of.java.chapter11.list;

import by.lepnikau.philosophy.of.java.util.typeinfo.Pets;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet.Pet;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            ArrayList<Pet> pets = Pets.arrayList(8);
            LinkedList<Pet> petsLL = new LinkedList<>(pets);
            HashSet<Pet> petsH5 = new HashSet<>(pets);
            TreeSet<Pet> petsTS = new TreeSet<>(pets);
            display(pets.iterator());
            display(petsLL.iterator());
            display(petsH5.iterator());
            display(petsTS.iterator());
        }
    }
