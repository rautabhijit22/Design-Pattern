package DesignPattern.Structural.Decorator;

//base Addon
public class OrangeCone implements IceCream{

    //empty cpnstructor as we are taking it as base addon
    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone" + " ";
    }
}
