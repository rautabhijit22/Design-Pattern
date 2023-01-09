package DesignPattern.Creational.Factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        else return new IosUIFactory();
    }
}
