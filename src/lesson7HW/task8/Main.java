package lesson7HW.task8;

import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        CarRentalSystem system = new CarRentalSystem();
        Car car1 = new Car(1, "Camry", "Toyota", 2022);
        Car car2 = new Car(2, "X5", "BMW", 2023);
        Car car3 = new Car(3, "Sonata", "Hyundai", 2021);
        system.addCar(car1);
        system.addCar(car2);
        system.addCar(car3);




        Customer customer1 = new Customer(101, "Aydin", "AZ12345");
        Customer customer2 = new Customer(102, "Nigar", "AZ45678");

        system.rentCar(car1, customer1);
        system.rentCar(car2, customer2);

//        system.printActiveRentals();
//        system.printAvailableCars();

        system.returnCar(customer1);
        system.printRentalHistory();
//        system.printAvailableCars();
    }
}
