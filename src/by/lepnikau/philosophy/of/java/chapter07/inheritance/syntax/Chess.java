package by.lepnikau.philosophy.of.java.chapter07.inheritance.syntax;

class Game {
    Game(int i) {
        System.out.println("KoHCTpyKTop Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("KoHCTpyKTop BoardGame");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("KoHCTpyKTop Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
