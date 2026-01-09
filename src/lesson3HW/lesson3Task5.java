package lesson3HW;

import java.util.Arrays;

public class lesson3Task5 {
    public static void main(String[] args) {
        String str = "OpenAI";
        char[] chars = str.toCharArray();

        for (int i = 0, j = chars.length-1; i < chars.length/2; i++, j--) {
            char pivot =chars[i];
            chars[i] =chars[j];
            chars[j] = pivot;

        }
        System.out.println(Arrays.toString(chars));
        }
    }

