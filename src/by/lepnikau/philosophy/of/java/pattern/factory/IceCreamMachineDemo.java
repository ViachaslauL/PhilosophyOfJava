package by.lepnikau.philosophy.of.java.pattern.factory;

public class IceCreamMachineDemo {
    public static void main(String[] args) {

        IceCreamMachine machine = new IceCreamMachine();
        IceCream vanilla = machine.getIceCream(IceCreamTypes.VANILLA);
        IceCream chocolate = machine.getIceCream(IceCreamTypes.CHOCOLATE);
        IceCream fruits = machine.getIceCream(IceCreamTypes.FRUITS);

        vanilla.eat();
        chocolate.eat();
        fruits.eat();
    }
}
