package lesson2HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2Task6 {
    public static void main(String[] args) {

        System.out.println("Enter how many Fibonacci numbers to print");
        int num = new Scanner(System.in).nextInt();
        if(num <= 0) System.out.println("Please, enter the correct number");
        else {
            int k = 0;
        for (int m = 0, i = 0, j = 1; m < num; m++) {
            if(i == 0) System.out.println(i+ " This is 0");
            else if(i%2 == 0) System.out.println(i + " Number is even");
            else System.out.println(i+ " Number is odd");
            k = j;
            j = i + j;
            i = k;
        }}

    }

    }

