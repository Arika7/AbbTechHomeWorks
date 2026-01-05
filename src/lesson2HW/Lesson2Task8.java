package lesson2HW;

import java.util.Scanner;

public class Lesson2Task8 {
    public static void main(String[] args) {
        System.out.println("Enter a number, please");
        String num= new Scanner(System.in).nextLine();
        int number = Integer.parseInt(num);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(num.substring(i, i+1));
            sum+= factorial(digit);
        }

        if(sum == number) System.out.println("Strong number");
        else System.out.println("Not strong number");

    }

    public static int factorial(int num){
        int res = 1;
        for (int i = num; i >0 ; i--) {
            res = res*i;
        }
        return res;
    }
}
