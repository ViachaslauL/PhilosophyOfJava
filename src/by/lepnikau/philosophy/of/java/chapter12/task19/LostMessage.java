package by.lepnikau.philosophy.of.java.chapter12.task19;

class VeryImportantException extends Exception {
    public String toString() {
        return "Очень важное исключение!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }
}

public class LostMessage {

    public static void main(String[] args) {
        try{
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException humException) {
                    System.out.println(humException.toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }
}
