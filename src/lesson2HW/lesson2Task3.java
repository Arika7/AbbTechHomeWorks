package lesson2HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson2Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a number, please: ");

        while (true) {
            try {
                int number = new Scanner(System.in).nextInt();
                for (int i = 0; i <= number; i++) {
                    if (i % 2 != 0) System.out.println(i);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please type in correct number");
            }
        }}}

