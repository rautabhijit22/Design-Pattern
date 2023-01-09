package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.components.button.Button;
import DesignPattern.Creational.Factory.components.dropdown.DropDown;
import DesignPattern.Creational.Factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropdown();

}
