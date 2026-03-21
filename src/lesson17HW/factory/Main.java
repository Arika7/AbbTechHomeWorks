package lesson17HW.factory;

public class Main {
    static void main() {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        animal.speak();
    }
}
