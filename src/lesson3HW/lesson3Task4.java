package lesson3HW;

import java.util.Arrays;

public class lesson3Task4 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int pivot = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pivot;
                }
            }
        }

        for (int i = 0, j = arr.length-1; i !=j; i++, j--) {
            int pivot = arr[i];
            arr[i] = arr[j];
            arr[j] = pivot;

        }

        for (int g : arr) System.out.println(g);

    }
}
