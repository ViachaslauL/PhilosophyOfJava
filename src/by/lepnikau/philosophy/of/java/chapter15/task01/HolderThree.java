package by.lepnikau.philosophy.of.java.chapter15.task01;

import by.lepnikau.philosophy.of.java.util.typeinfo.pets.Hamster;
import by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet.Pet;

public class HolderThree<T> {
    private T ref;

    public HolderThree(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }

    public static void main(String[] args) {
        HolderThree<Pet> holder = new HolderThree<>(new Hamster());

        System.out.println(holder.getRef().toString());
    }
}
