package lesson2HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson2Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a day of the week: ");
        while (true){
            try{
                int number =  new Scanner(System.in).nextInt();
                switch (number){
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                    default -> System.out.println("There is no day of the week by this number");
                }
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Please type in correct number");
            }

        }
    }
}
