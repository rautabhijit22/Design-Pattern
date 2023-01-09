package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.components.button.Button;
import DesignPattern.Creational.Factory.components.button.IosButton;
import DesignPattern.Creational.Factory.components.dropdown.DropDown;
import DesignPattern.Creational.Factory.components.dropdown.IosDropdown;
import DesignPattern.Creational.Factory.components.menu.IosMenu;
import DesignPattern.Creational.Factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new IosDropdown();
    }
}
