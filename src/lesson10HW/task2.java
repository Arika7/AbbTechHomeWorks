package lesson10HW;

import java.util.Scanner;

public class task2 {

    public static void checkAge(int age) throws InvalidInputException {
        if (age < 0 || age > 120) {
            throw new InvalidInputException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age entered: " + age);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkAge(age);

        } catch (InvalidInputException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type. Please enter a number.");
        }
    }
}
