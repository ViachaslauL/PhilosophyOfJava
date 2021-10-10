package by.lepnikau.philosophy.of.java.chapter21.example.resources;

class EvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;

    @Override
    public int next() {
        currentEvenValue++;
        currentEvenValue++;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
