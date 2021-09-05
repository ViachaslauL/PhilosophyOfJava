package by.lepnikau.philosophy.of.java.chapter11.list;

import by.lepnikau.philosophy.of.java.util.typeinfo.Pets;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Hamster;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Rat;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet.Pet;

import java.util.LinkedList;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.linkedList(5));
        print(pets.toString());
// Идентично:
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
// Отличается только поведение для пустого списка:
        print("pets.peek(): " + pets.peek());
// Идентично; удаление и возвращение первого элемента:
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
// Отличается только поведение для пустого списка:
        print("pets.poll(): " + pets.poll());
        print(pets.toString());
        pets.addFirst(new Rat());
        print("После addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        print("После offer ():" + pets);
        pets.add(Pets.randomPet());
        print("После add ():" + pets);
        pets.addLast(new Hamster());
        print("После addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
    }
}
