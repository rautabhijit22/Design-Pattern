package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.components.button.Button;
import DesignPattern.Creational.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        UIFactory factory = flutter.createUIFactory();
        Menu menu = factory.createMenu();
        Button button =  factory.createButton();
    }
}
