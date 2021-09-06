package by.lepnikau.philosophy.of.java.chapter15.random.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomList<T> implements Iterable<T> {
    private List<T> store = new ArrayList<>();
    private Random random = new Random();

    public void add(T element) {
        store.add(element);
    }

    public T select() {
        return store.get(random.nextInt(store.size()));
    }

    public int size() {
        return store.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new RandomListIterator();
    }

    class RandomListIterator implements Iterator<T> {
        private int count = store.size() - 1;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public T next() {
            count--;
            return select();
        }
    }
}
