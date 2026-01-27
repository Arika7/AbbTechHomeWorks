package lesson7HW.task8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CarRentalSystem {

    private final Set<Car> allCars = new HashSet<>();

    private final Map<Customer,Car > carCustomerMap = new HashMap<>();

    private final Map<Car, LocalDateTime> activeCarRent = new HashMap<>();

    private final Set<Car> freeCars = new HashSet<>();

    private final Map<Car, Map<LocalDateTime, LocalDateTime>> carRentHistory = new HashMap<>();



    public CarRentalSystem() {

    }

    public void addCar(Car car){
        allCars.add(car);
        freeCars.add(car);

    }

    public void rentCar(Car car, Customer customer){
        if(!freeCars.contains(car)) System.out.println("Car is not available!");
        else {
            carCustomerMap.put(customer, car);
            freeCars.remove(car);

            activeCarRent.put(car,LocalDateTime.now());

        }
    }

    public void returnCar(Customer customer) {
        Car car = carCustomerMap.get(customer);
        if(freeCars.contains(car)) System.out.println("Car is not rented");
        else {
            freeCars.add(car);
            System.out.println(car + " was returned at "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            Map<LocalDateTime, LocalDateTime> rentDate = new HashMap<>();
            rentDate.put(activeCarRent.get(car), LocalDateTime.now().plusHours(53));
            carRentHistory.put(car, rentDate);
            activeCarRent.remove(car);
        }
    }

    public void printActiveRentals(){
        Set<Car> rentedCars = activeCarRent.keySet();

        for (Car car : rentedCars){

            System.out.println(car +" is rented by "+getKeyByValue(carCustomerMap, car).name+" at: " + activeCarRent.get(car).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }


    public void printAvailableCars(){
        freeCars.forEach(System.out::println);
    }


    public void printRentalHistory(){
        Set<Car> car = carRentHistory.keySet();
        Set<LocalDateTime> rentTime;

        for (Car c : car){
            rentTime = carRentHistory.get(c).keySet();
            for (LocalDateTime time : rentTime){
                System.out.println(c + " was rented at: " + time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " and returned at: " + carRentHistory.get(c).get(time).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                System.out.println(c + " was rented for " + Duration.between(time, carRentHistory.get(c).get(time)).toHours()+ " hours by "+ getKeyByValue(carCustomerMap,c).name);
            }

        }


    }
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}
