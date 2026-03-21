package lesson17HW.abstractFactory;

import java.awt.*;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return () -> System.out.println("CheckBox created");
    }
}
