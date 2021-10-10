package by.lepnikau.philosophy.of.java.chapter17.example.hashcode;

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Individual() {
    }

    public Individual(String name) {
        this.name = name;
    }

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Individual && id == ((Individual) o).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null)
            result = 37 * result + name.hashCode();
        result = 37 * result + (int) id;
        return result;
    }

    @Override
    public int compareTo(Individual arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();

        int compareFirst = first.compareTo(argFirst);
        if (compareFirst != 0) {
            return compareFirst;
        }

        if (name != null && arg.name != null) {
            int compareTwo = name.compareTo(arg.name);
            if (compareTwo != 0) {
                return compareTwo;
            }
        }

        return (Long.compare(arg.id, id));
    }
}
