package lesson17HW.abstractFactory;

public class Main {
    static void main() {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.render();
    }
}
