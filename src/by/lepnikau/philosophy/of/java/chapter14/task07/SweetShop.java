package by.lepnikau.philosophy.of.java.chapter14.task07;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

class Candy {
    static {
        print("Загрузка класса Candy");
    }
}

class Gum {
    static {
        print("Загрузка класса Gum");
    }
}

class Cookie {
    static {
        print("Загрузка класса Cookie");
    }
}

public class SweetShop {

    public static void main(String[] args) {
        try {
            Class.forName("by.viachaslau.chapter14.task07." + args[0]);
        } catch (Exception e) {
            print("He удалось найти Gum");
        }
        print("После вызова метода Class.forName(\""+ args[0] +"\")");
    }
}
