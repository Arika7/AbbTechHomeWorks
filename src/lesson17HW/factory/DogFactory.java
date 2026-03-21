package lesson17HW.factory;

class DogFactory extends AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}
