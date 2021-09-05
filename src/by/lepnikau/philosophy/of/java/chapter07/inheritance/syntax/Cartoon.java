package by.lepnikau.philosophy.of.java.chapter07.inheritance.syntax;

class Art {
    Art() {
        System.out.println("KoHCTpyKTop Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("KoHCTpyKTop Drawing");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("KoHCTpyKTop Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
