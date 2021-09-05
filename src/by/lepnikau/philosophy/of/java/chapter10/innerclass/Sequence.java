package by.lepnikau.philosophy.of.java.chapter10.innerclass;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    public Object[] getItems() {
        return items;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }

        public Sequence getOuterClassReference() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Sequence sequence1 = new Sequence(5);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        Selector selector1 = sequence1.selector();

        SequenceSelector sequenceSelector = (SequenceSelector) selector1;
        int length = sequenceSelector.getOuterClassReference().getItems().length;
        System.out.println(length);

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
