package by.lepnikau.philosophy.of.java.chapter12;

class OneException extends Exception {
    public OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Создание исключения в f()");
        throw new OneException("из f()");
    }

    public static void main(String[] args) {
        try{
            try{
                f();
            }catch (OneException e) {
                System.out.println("Перехвачено во внутреннем блоке try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("Из внутреннего блока try");
            }
        } catch (TwoException e) {
            System.out.println("Перехвачено во внешнем блоке try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
