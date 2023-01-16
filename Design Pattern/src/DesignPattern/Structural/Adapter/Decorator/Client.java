package DesignPattern.Structural.Decorator;

public class Client {

    public static void main(String[] args) {
        IceCream ic = new ChocolateScoop(
                        new VanillaScoop(
                            new ChocolateSyrup(
                                 new OrangeCone())));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
