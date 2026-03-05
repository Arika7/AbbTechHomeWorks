package lesson10HW;

import java.util.Scanner;

public class task1 {
     static void main() {
         Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try{
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
     }

}
