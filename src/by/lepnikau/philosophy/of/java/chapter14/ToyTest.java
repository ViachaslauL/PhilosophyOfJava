package by.lepnikau.philosophy.of.java.chapter14;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Закомментируйте следующий конструктор по умолчанию,
// чтобы увидеть ошибку NoSuchMethodError ив (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Канноническое имя : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("by.lepnikau.philosophy.of.java.chapter14.FancyToy");
        } catch (ClassNotFoundException e) {
            print("He удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            // Необходим конструктор по умолчанию:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("He удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
