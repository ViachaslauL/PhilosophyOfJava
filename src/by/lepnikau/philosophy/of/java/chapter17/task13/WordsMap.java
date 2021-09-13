package by.lepnikau.philosophy.of.java.chapter17.task13;

class WordsMap<K, V> {
    private Object[][] pairs;
    private int index;

    public WordsMap(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V val) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, val};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (Object[] pair : pairs)
            if (pair[0].equals(key))
                return (V) pair[1];
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object[] pair : pairs) {
            sb.append(pair[0].toString());
            sb.append(" : ");
            sb.append(pair[1].toString()).append("\n");
        }
        return sb.toString();
    }
}
