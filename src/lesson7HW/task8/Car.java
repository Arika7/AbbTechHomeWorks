package lesson7HW.task8;

import java.util.Objects;

public class Car {
    long id;
    String model;
    String brand;
    int year;


    public Car(long id, String model, String brand, int year) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return brand+" "+model+" "+year;
    }
}
