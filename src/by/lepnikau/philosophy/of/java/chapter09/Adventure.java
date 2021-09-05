package by.lepnikau.philosophy.of.java.chapter09;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    int var = 1;
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("Fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
        System.out.println("Swim");
    }

    public void fly() {
        System.out.println("Fly");
    }

    public void climb() {
        System.out.println("Climb " + CanClimb.var);
    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void c(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Используем объект в качестве типа CanFight
        u(h); // Используем объект в качестве типа CanSwim
        v(h); // Используем объект в качестве типа CanFly
        c(h); // Используем объект в качестве типа CanClimb
        w(h); // Используем объект в качестве ActionCharacter
    }
}
