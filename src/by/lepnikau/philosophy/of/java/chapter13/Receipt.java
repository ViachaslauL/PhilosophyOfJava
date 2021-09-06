package by.lepnikau.philosophy.of.java.chapter13;

import java.util.Formatter;

public class Receipt {
    private static final int I_WIDTH = -15;
    private static final int Q_WIDTH = 5;
    private static final int P_WIDTH = 10;

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%" + I_WIDTH + "s %" + Q_WIDTH + "s %" + P_WIDTH + "s\n",
                "Item", "Qty", "Price");
        f.format("%" + I_WIDTH + "s %" + Q_WIDTH + "s %" + P_WIDTH + "s\n",
                "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%" + I_WIDTH + ".15s %" + Q_WIDTH + "s %" + P_WIDTH + ".2f\n",
                name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%" + I_WIDTH + "s %" + Q_WIDTH + "s %" + P_WIDTH + ".2f\n",
                "Tax", "", total * 0.06);
        f.format("%" + I_WIDTH + "s %" + Q_WIDTH + "s %" + P_WIDTH + "s\n",
                "", "", "-----");
        f.format("%" + I_WIDTH + "s %" + Q_WIDTH + "s %" + P_WIDTH + ".2f\n",
                "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
