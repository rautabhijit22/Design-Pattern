package DesignPattern.Structural.Decorator;

//base addOn also Topping/Addon
public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    //when chocolate is base
    public ChocolateCone() {
    }

    //when chocolate is topping
    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream==null){
            return 20;
        }
        else return iceCream.getCost()+20;
    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return "Chocolate Cone";
        }
        else{
            return iceCream.getDescription() + "Chocolate Cone"+" ";
        }

    }
}
