package by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet;

public class Pet implements Comparable<Pet>{

    protected String name;
    protected String id ;

    public int id() {
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int compareTo(Pet o) {
        int result = o.getClass().getSimpleName().compareTo(this.getClass().getSimpleName());
        return java.lang.Integer.compare(0, result);
    }
}
