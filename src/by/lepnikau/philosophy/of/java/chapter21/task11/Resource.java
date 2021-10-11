package by.lepnikau.philosophy.of.java.chapter21.task11;

class Resource {
    private int fieldOne;
    private int fieldTwo = 1;

    public void incrOne() {
        fieldOne++;
        fieldOne++;
    }

    public void incrTwo() {
        fieldTwo++;
        fieldTwo++;
    }

    public int getFieldOne() {
        return fieldOne;
    }

    public int getFieldTwo() {
        return fieldTwo;
    }
}
