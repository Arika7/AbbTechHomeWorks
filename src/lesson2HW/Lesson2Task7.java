package lesson2HW;

import java.util.Scanner;

public class Lesson2Task7 {
    public static void main(String[] args) {
        System.out.println("Enter a number, please");
        int num = new Scanner(System.in).nextInt();
        if(num < 0) System.out.println("Factorial does not exist for negative numbers");
        else {
            int res = 1;
            for (int i = num; i >0 ; i--) {
                res = res*i;
            }
            System.out.println(res);
        }
    }
}
