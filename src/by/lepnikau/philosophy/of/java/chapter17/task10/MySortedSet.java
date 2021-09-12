package by.lepnikau.philosophy.of.java.chapter17.task10;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class MySortedSet<E> extends LinkedList<E> {
    private Comparator<E> comparator;

    public MySortedSet() {
    }

    public MySortedSet(Collection<? extends E> c) {
        super(c);
    }

    public MySortedSet(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public boolean add(E elem) {
        if (!contains(elem)) {
            super.add(elem);
            if (comparator != null) {
                sort(comparator);
            }
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        if (comparator != null && super.addAll(c)) {
            sort(comparator);
            return true;
        }
        return super.addAll(c);
    }

    public MySortedSet<E> subSet(E from, E to) {
        MySortedSet<E> set = new MySortedSet<>();
        if (contains(from) && contains(to) && indexOf(from) < indexOf(to))
            set.addAll(subList(indexOf(from), indexOf(to)));
        return set;
    }

    public E first() {
        return get(0);
    }

    public E last() {
        return get(size() - 1);
    }

    public MySortedSet<E> headSet(E to) {
        MySortedSet<E> set = new MySortedSet<>();
        if (contains(to))
            set.addAll(super.subList(0, indexOf(to)));
        return set;
    }

    public MySortedSet<E> tailSet(E from) {
        MySortedSet<E> set = new MySortedSet<>();
        if (contains(from))
            set.addAll(super.subList(indexOf(from), size()));
        return set;
    }

    public Comparator<E> comparator() {
        return comparator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i).toString()).append(i + 1 == size() ? "" : ", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
