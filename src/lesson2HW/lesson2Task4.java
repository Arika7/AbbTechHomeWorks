package lesson2HW;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class lesson2Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a number, please: ");
        String word = new Scanner(System.in).nextLine();

        boolean isPalindrome = true;
            for (int i = word.length()-1, j = 0; i > 0 ; i--) {
                if(word.charAt(j) != word.charAt(i)) {
                    isPalindrome = false;
                    break;
                }
                j++;
                if(j == i) break;
            }
        boolean isIncreasing = true;
        for (int j = 1, i = 0; j < word.length(); j++, i++) {
            if(word.charAt(i) > word.charAt(j)) {
                isIncreasing = false;
                break;
            }

        }
        boolean isDecreasing = true;
        for (int j = 1, i = 0; j < word.length(); j++, i++) {
            if(word.charAt(i) < word.charAt(j)) {
                isDecreasing = false;
                break;
            }

        }
        if(isPalindrome) System.out.println("Number is palindrome");
        else if(isIncreasing) System.out.println("Digits are in increasing order ");
        else if(isDecreasing) System.out.println("Digits are in decreasing order ");
        else System.out.println("The digits are neither in increasing nor decreasing order.");


    }
}
