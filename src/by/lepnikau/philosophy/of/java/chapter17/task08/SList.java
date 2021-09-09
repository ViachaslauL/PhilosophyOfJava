package by.lepnikau.philosophy.of.java.chapter17.task08;

public class SList<E> {
    private Link start;
    private Link end;
    private Link cursor;

    private class Link {
        private Link next;
        private final E element;

        public Link(Link next, E element) {
            this.next = next;
            this.element = element;
        }

        public void setNext(Link next) {
            this.next = next;
        }

        public Link getNext() {
            return next;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    class SListIterator {

        void add(E element) {
            if (end == null) {
                start = cursor = end = new Link(null, element);
            } else {
                Link link = end;
                end = new Link(null, element);
                link.setNext(end);
            }
        }

        boolean hasNext() {
            return cursor != null;
        }

        Link next() {
            Link tempCursor = cursor;
            if (hasNext()) {
                cursor = cursor.getNext();
            }
            return tempCursor;
        }
    }

    public SListIterator sListIterator() {
        return new SListIterator();
    }

    @Override
    public String toString() {
        cursor = start;
        StringBuilder sb = new StringBuilder();
        SListIterator sListIter = sListIterator();
        while (sListIter.hasNext()) {
            sb.append(sListIter.next()).append("\n");
        }
        return sb.toString();
    }
}
