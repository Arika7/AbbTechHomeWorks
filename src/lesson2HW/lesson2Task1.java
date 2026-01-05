package lesson2HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson2Task1 {
    public static void main(String[] args) {
        System.out.println("Enter a number, please: ");
        while (true){
       try{
           int number =  new Scanner(System.in).nextInt();
           if(number> 0) System.out.println("Number is positive");
           else if (number == 0) System.out.println("Number is 0");
           else System.out.println("Number is negative");
           break;
       }
       catch (InputMismatchException e){
           System.out.println("Please type in correct number");
       }

       }

    }
}
