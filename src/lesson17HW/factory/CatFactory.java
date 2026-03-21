package lesson17HW.factory;

class CatFactory extends AnimalFactory {
    public Animal createAnimal() {
        return new Cat();
    }
}
