package lesson17HW.abstractFactory;

public class WindowsButton implements Button{
    public void render() {
        System.out.println("Windows Button");
    }
}

class MacButton implements Button {
    public void render() {
        System.out.println("Mac Button");
    }
}
