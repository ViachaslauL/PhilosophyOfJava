//: generics/coffee/Coffee.java
package by.lepnikau.philosophy.of.java.chapter14.task12.coffee;

public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
} ///:~
