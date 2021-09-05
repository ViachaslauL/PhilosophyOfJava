package by.lepnikau.philosophy.of.java.chapter08;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

class StaticSuper {
    public static String staticGet() {
        return "Базовая версия staticGet()";
    }

    public String dynamicGet() {
        return "Базовая версия dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Производная версия staticGet()";
    }

    public String dynamicGet() {
        return "Производная версия dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Восходящее преобразование
        print(sup.staticGet());
        print(sup.dynamicGet());
    }
}
