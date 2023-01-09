package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.components.button.AndroidButton;
import DesignPattern.Creational.Factory.components.button.Button;
import DesignPattern.Creational.Factory.components.dropdown.AndroidDropdown;
import DesignPattern.Creational.Factory.components.dropdown.DropDown;
import DesignPattern.Creational.Factory.components.menu.AndroidMenu;
import DesignPattern.Creational.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropdown() {
        return new AndroidDropdown();
    }
}
