package lesson17HW.abstractFactory;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return () -> System.out.println("Mac Checkbox");
    }
}
