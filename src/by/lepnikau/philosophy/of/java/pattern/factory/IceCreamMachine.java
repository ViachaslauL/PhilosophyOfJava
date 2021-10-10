package by.lepnikau.philosophy.of.java.pattern.factory;

public class IceCreamMachine {

    public IceCream getIceCream(IceCreamTypes type) {
        IceCream iceCream = null;

        switch (type) {
            case CHOCOLATE:
                iceCream = new ChocolateIceCream();
                break;
            case FRUITS:
                iceCream = new FruitsIceCream();
                break;
            case VANILLA:
                iceCream = new VanillaIceCream();
                break;
            default:
                throw new IllegalArgumentException("Wrong ice cream type: " + type);
        }
        return iceCream;
    }
}
