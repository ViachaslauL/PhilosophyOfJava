//: holding/MapOfList.java
package by.lepnikau.philosophy.of.java.util;
import by.lepnikau.philosophy.of.java.chapter14.petcount.person.Person;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.Pet;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.cat.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.dog.*;
import by.lepnikau.philosophy.of.java.chapter14.petcount.pet.rodent.*;

import java.util.*;
import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

public class MapOfList {
  public static Map<Person, List<? extends Pet>>
    petPeople = new HashMap<>();
  static {
    petPeople.put(new Person("Dawn"),
      Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
    petPeople.put(new Person("Kate"),
      Arrays.asList(new Cat("Shackleton"),
        new Cat("Elsie May"), new Dog("Margrett")));
    petPeople.put(new Person("Marilyn"),
      Arrays.asList(
       new Pug("Louie aka Louis Snorkelstein Dupree"),
       new Cat("Stanford aka Stinky el Negro"),
       new Cat("Pinkola")));
    petPeople.put(new Person("Luke"),
      Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
    petPeople.put(new Person("Isaac"),
      Arrays.asList(new Rat("Freckly")));
  }
  public static void main(String[] args) {
    print("People: " + petPeople.keySet());
    print("Pets: " + petPeople.values());
    for(Person person : petPeople.keySet()) {
      print(person + " has:");
      for(Pet pet : petPeople.get(person))
        print("    " + pet);
    }
  }
}
