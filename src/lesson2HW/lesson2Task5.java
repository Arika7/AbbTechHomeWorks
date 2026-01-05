package lesson2HW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson2Task5 {
    public static void main(String[] args) {
        System.out.println("Enter your age, please: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Enter your gender, please(M or F): " );
        String gender = new Scanner(System.in).nextLine();

        if(!(gender.equals("M")|| gender.equals("F"))) System.out.println("Invalid gender entered");

       if(age>=18 && gender.equals("M")) System.out.println("Male access granted");
       else if(age>=18 && gender.equals("F")) System.out.println("Female access granted");
       else System.out.println("Access denied");

    }
}
