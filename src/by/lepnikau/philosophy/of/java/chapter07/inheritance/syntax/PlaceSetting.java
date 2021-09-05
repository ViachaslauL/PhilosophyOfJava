package by.lepnikau.philosophy.of.java.chapter07.inheritance.syntax;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

class Plate {
    Plate(int i) {
        print("KoHCTpyKTop Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("KoHCTpyKTop DinnerPlate");
    }
}

class Utensil {
    Utensil(int i) {
        print("KoHCTpyKTop Utensil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("KoHCTpyKTOp Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Конструктор Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("KoHCTpyKTop Knife");
    }
}

class Custom {
    Custom(int i) {
        print("KoHCTpyKTOp Custom");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("Конструктор PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
